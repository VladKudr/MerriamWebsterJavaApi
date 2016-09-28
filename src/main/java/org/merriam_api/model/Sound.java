package org.merriam_api.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by kudrjavtsev on 28/09/2016.
 * MerriamWebsterJavaApi
 */
class Sound {
    @XmlElement(name = "wav")
    protected String wavName;

    public String getWavName() {
        return wavName;
    }
}
