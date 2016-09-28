package org.merriam_api.spring;

import org.springframework.http.InvalidMediaTypeException;
import org.springframework.http.MediaType;
import org.springframework.util.InvalidMimeTypeException;
import org.springframework.util.MimeType;
import org.springframework.util.MimeTypeUtils;

import java.nio.charset.Charset;
import java.util.Map;

/**
 * Created by kudrjavtsev on 28/09/2016.
 * MerriamWebsterJavaApi
 */
public class MediaTypeMerriam extends MediaType {
    public MediaTypeMerriam(String type) {
        super(type);
    }

    public MediaTypeMerriam(String type, String subtype) {
        super(type, subtype);
    }

    public MediaTypeMerriam(String type, String subtype, Charset charset) {
        super(type, subtype, charset);
    }

    public MediaTypeMerriam(String type, String subtype, double qualityValue) {
        super(type, subtype, qualityValue);
    }

    public MediaTypeMerriam(MediaType other, Map<String, String> parameters) {
        super(other, parameters);
    }

    public MediaTypeMerriam(String type, String subtype, Map<String, String> parameters) {
        super(type, subtype, parameters);
    }

    /**
     * Parse the given String into a single {@code MediaType}.
     *
     * @param mediaType the string to parse
     * @return the media type
     * @throws InvalidMediaTypeException if the string cannot be parsed
     */
    public static MediaTypeMerriam parseMediaType(String mediaType) {
        MimeType type;
        try {
            if (mediaType.equals("xml")) {
                mediaType = APPLICATION_XML_VALUE;
            }
            type = MimeTypeUtils.parseMimeType(mediaType);
        } catch (InvalidMimeTypeException ex) {
            throw ex;
        }
        try {
            return new MediaTypeMerriam(type.getType(), type.getSubtype(), type.getParameters());
        } catch (IllegalArgumentException ex) {
            throw new InvalidMediaTypeException(mediaType, ex.getMessage());
        }
    }
}
