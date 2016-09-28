package org.merriam_api.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.GenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.util.Assert;
import org.springframework.web.client.HttpMessageConverterExtractor;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestClientException;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by kudrjavtsev on 28/09/2016.
 * MerriamWebsterJavaApi
 */

class MessageBodyClientHttpResponseWrapperMerr implements ClientHttpResponse {

    private final ClientHttpResponse response;

    private PushbackInputStream pushbackInputStream;


    public void setPushbackInputStream(PushbackInputStream pushbackInputStream) {
        this.pushbackInputStream = pushbackInputStream;
    }

    public MessageBodyClientHttpResponseWrapperMerr(ClientHttpResponse response) throws IOException {
        this.response = response;
    }


    /**
     * Indicates whether the response has a message body.
     * <p>Implementation returns {@code false} for:
     * <ul>
     * <li>a response status of {@code 1XX}, {@code 204} or {@code 304}</li>
     * <li>a {@code Content-Length} header of {@code 0}</li>
     * </ul>
     *
     * @return {@code true} if the response has a message body, {@code false} otherwise
     * @throws IOException in case of I/O errors
     */
    public boolean hasMessageBody() throws IOException {
        HttpStatus responseStatus = this.getStatusCode();
        if (responseStatus.is1xxInformational() || responseStatus == HttpStatus.NO_CONTENT ||
                responseStatus == HttpStatus.NOT_MODIFIED) {
            return false;
        } else if (this.getHeaders().getContentLength() == 0) {
            return false;
        }
        return true;
    }

    /**
     * Indicates whether the response has an empty message body.
     * <p>Implementation tries to read the first bytes of the response stream:
     * <ul>
     * <li>if no bytes are available, the message body is empty</li>
     * <li>otherwise it is not empty and the stream is reset to its start for further reading</li>
     * </ul>
     *
     * @return {@code true} if the response has a zero-length message body, {@code false} otherwise
     * @throws IOException in case of I/O errors
     */
    public boolean hasEmptyMessageBody() throws IOException {
        InputStream body = this.response.getBody();
        if (body == null) {
            return true;
        } else if (body.markSupported()) {
            body.mark(1);
            if (body.read() == -1) {
                return true;
            } else {
                body.reset();
                return false;
            }
        } else {
            this.pushbackInputStream = new PushbackInputStream(body);
            int b = this.pushbackInputStream.read();
            if (b == -1) {
                return true;
            } else {
                this.pushbackInputStream.unread(b);
                return false;
            }
        }
    }


    @Override
    public HttpHeadersMerr getHeaders() {

        return new HttpHeadersMerr(this.response.getHeaders());
    }

    @Override
    public InputStream getBody() throws IOException {
        return (this.pushbackInputStream != null ? this.pushbackInputStream : this.response.getBody());
    }


    @Override
    public HttpStatus getStatusCode() throws IOException {
        return this.response.getStatusCode();
    }

    @Override
    public int getRawStatusCode() throws IOException {
        return this.response.getRawStatusCode();
    }

    @Override
    public String getStatusText() throws IOException {
        return this.response.getStatusText();
    }

    @Override
    public void close() {
        this.response.close();
    }

}

public class HttpMessageConverterExtractorMerr<T> implements ResponseExtractor<T> {

    private final Type responseType;

    private final Class<T> responseClass;

    private final List<HttpMessageConverter<?>> messageConverters;

    private final Log logger;


    /**
     * Create a new instance of the {@code HttpMessageConverterExtractor} with the given response
     * type and message converters. The given converters must support the response type.
     */
    public HttpMessageConverterExtractorMerr(Class<T> responseType, List<HttpMessageConverter<?>> messageConverters) {
        this((Type) responseType, messageConverters);
    }

    /**
     * Creates a new instance of the {@code HttpMessageConverterExtractor} with the given response
     * type and message converters. The given converters must support the response type.
     */
    public HttpMessageConverterExtractorMerr(Type responseType, List<HttpMessageConverter<?>> messageConverters) {
        this(responseType, messageConverters, LogFactory.getLog(HttpMessageConverterExtractor.class));
    }

    @SuppressWarnings("unchecked")
    HttpMessageConverterExtractorMerr(Type responseType, List<HttpMessageConverter<?>> messageConverters, Log logger) {
        Assert.notNull(responseType, "'responseType' must not be null");
        Assert.notEmpty(messageConverters, "'messageConverters' must not be empty");
        this.responseType = responseType;
        this.responseClass = (responseType instanceof Class) ? (Class<T>) responseType : null;
        this.messageConverters = messageConverters;
        this.logger = logger;
    }


    private PushbackInputStream transformForInvalidXMlMerriam(InputStream inStream) {
        StringBuilder stringBuilder = new StringBuilder();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inStream));

        String line = null;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {

        }


        return new PushbackInputStream(new ByteArrayInputStream(stringBuilder.toString().replaceAll("\t", "").trim().replaceAll("<it>", "").replaceAll("</it>", "")
                .replaceAll("<phrase>", "").replaceAll("</phrase>", "").getBytes()));
    }

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    public T extractData(ClientHttpResponse response) throws IOException {
        MessageBodyClientHttpResponseWrapperMerr responseWrapper = new MessageBodyClientHttpResponseWrapperMerr(response);
        if (!responseWrapper.hasMessageBody() || responseWrapper.hasEmptyMessageBody()) {
            return null;
        }
        MediaType contentType = getContentType(responseWrapper);

        responseWrapper.setPushbackInputStream(transformForInvalidXMlMerriam(responseWrapper.getBody()));
        for (HttpMessageConverter<?> messageConverter : this.messageConverters) {
            if (messageConverter instanceof GenericHttpMessageConverter) {
                GenericHttpMessageConverter<?> genericMessageConverter = (GenericHttpMessageConverter<?>) messageConverter;
                if (genericMessageConverter.canRead(this.responseType, null, contentType)) {
                    if (logger.isDebugEnabled()) {
                        logger.debug("Reading [" + this.responseType + "] as \"" +
                                contentType + "\" using [" + messageConverter + "]");
                    }
                    return (T) genericMessageConverter.read(this.responseType, null, responseWrapper);
                }
            }
            if (this.responseClass != null) {
                if (messageConverter.canRead(this.responseClass, contentType)) {
                    if (logger.isDebugEnabled()) {
                        logger.debug("Reading [" + this.responseClass.getName() + "] as \"" +
                                contentType + "\" using [" + messageConverter + "]");
                    }
                    return (T) messageConverter.read((Class) this.responseClass, responseWrapper);
                }
            }
        }

        throw new RestClientException("Could not extract response: no suitable HttpMessageConverter found " +
                "for response type [" + this.responseType + "] and content type [" + contentType + "]");
    }

    private MediaType getContentType(ClientHttpResponse response) {
        MediaType contentType = response.getHeaders().getContentType();
        if (contentType == null) {
            if (logger.isTraceEnabled()) {
                logger.trace("No Content-Type header found, defaulting to application/octet-stream");
            }
            contentType = MediaType.APPLICATION_OCTET_STREAM;
        }
        return contentType;
    }


}

