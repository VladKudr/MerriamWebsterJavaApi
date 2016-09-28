package org.merriam_api.model;

import javax.xml.bind.annotation.XmlMixed;
import java.util.List;

/**
 * Created by kudrjavtsev on 28/09/2016.
 * MerriamWebsterJavaApi
 */
class SimpleType {

    List<String> value;

    @XmlMixed
    public List<String> getValues() {
        return value;
    }

    public void setValues(List<String> values) {
        this.value = values;
    }
}
