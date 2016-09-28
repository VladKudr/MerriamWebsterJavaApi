package org.merriam_api.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by kudrjavtsev on 28/09/2016.
 * MerriamWebsterJavaApi
 */
class Definition {

    @XmlElement (name = "phrasev")
    List<PhrasalVerb> phrasalVerb;

    @XmlElement(name = "dt")
    List<DefiningText> definingText;

    public List<PhrasalVerb> getPhrasalVerb() {
        return phrasalVerb;
    }

    public List<DefiningText> getDefiningText() {
        return definingText;
    }
}
