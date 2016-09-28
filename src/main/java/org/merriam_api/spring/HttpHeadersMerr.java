package org.merriam_api.spring;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;

import java.util.Set;

/**
 * Created by kudrjavtsev on 28/09/2016.
 * MerriamWebsterJavaApi
 */
public class HttpHeadersMerr extends HttpHeaders {


    public HttpHeadersMerr() {
    }

    public HttpHeadersMerr(HttpHeaders headers) {

        Set<String> keys = headers.keySet();
        for (String key : keys) {
            put(key, headers.get(key));

        }
    }

    @Override
    public MediaType getContentType() {
        String value = getFirst(CONTENT_TYPE);
        return (StringUtils.hasLength(value) ? MediaTypeMerriam.parseMediaType(value) : null);
    }
}
