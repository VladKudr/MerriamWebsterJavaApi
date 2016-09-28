package org.merriam_api.spring;

import org.springframework.http.client.AbstractClientHttpResponse;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/**
 * Created by kudrjavtsev on 28/09/2016.
 * MerriamWebsterJavaApi
 */
public class MerrClientHttpResponse extends AbstractClientHttpResponse {

    private final HttpURLConnection connection;

    private HttpHeadersMerr headers;


    MerrClientHttpResponse(HttpURLConnection connection) {
        this.connection = connection;
    }


    @Override
    public int getRawStatusCode() throws IOException {
        return this.connection.getResponseCode();
    }

    @Override
    public String getStatusText() throws IOException {
        return this.connection.getResponseMessage();
    }

    @Override
    public HttpHeadersMerr getHeaders() {
        if (this.headers == null) {
            this.headers = new HttpHeadersMerr();
            // Header field 0 is the status line for most HttpURLConnections, but not on GAE
            String name = this.connection.getHeaderFieldKey(0);
            if (StringUtils.hasLength(name)) {
                this.headers.add(name, this.connection.getHeaderField(0));
            }
            int i = 1;
            while (true) {
                name = this.connection.getHeaderFieldKey(i);
                if (!StringUtils.hasLength(name)) {
                    break;
                }
                this.headers.add(name, this.connection.getHeaderField(i));
                i++;
            }
        }
        return this.headers;
    }

    @Override
    public InputStream getBody() throws IOException {
        InputStream errorStream = this.connection.getErrorStream();
        return (errorStream != null ? errorStream : this.connection.getInputStream());
    }

    @Override
    public void close() {
        this.connection.disconnect();
    }

}
