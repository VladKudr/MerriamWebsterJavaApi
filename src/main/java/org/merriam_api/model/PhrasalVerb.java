package org.merriam_api.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by kudrjavtsev on 28/09/2016.
 * MerriamWebsterJavaApi
 */
class PhrasalVerb {
    @XmlElement(name = "pva")
    protected String phrasalVerbForm;

    @XmlElement(name = "pvl")
    protected String phrasalVerbLabel;


}
