package org.merriam_api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMixed;
import java.util.List;

/**
 * Created by kudrjavtsev on 28/09/2016.
 * MerriamWebsterJavaApi
 */
class DefiningText {
    List<String> description;
    @XmlElement(name="vi")
    List<SimpleType> verbalIllustration;

    @XmlElement(name="un")
    List<UsageNote> usageNote;

    @XmlMixed
    public List<String> getDescription() {
        return description;
    }

    public List<SimpleType> getVerbalIllustration() {
        return verbalIllustration;
    }

    public List<UsageNote> getUsageNote() {
        return usageNote;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }
}
