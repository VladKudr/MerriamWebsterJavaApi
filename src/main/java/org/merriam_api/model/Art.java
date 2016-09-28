package org.merriam_api.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by kudrjavtsev on 28/09/2016.
 * MerriamWebsterJavaApi
 */
class Art{

    @XmlElement(name = "dim")
    protected String artDimension;

    @XmlElement(name = "artref")
    protected ArtRef artRef;

    @XmlElement(name = "capt")
    protected String artCaption;



    private static class ArtRef{
        @XmlAttribute(name = "id")
        String id;
    }
}
