package org.merriam_api.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by kudrjavtsev on 28/09/2016.
 * MerriamWebsterJavaApi
 */
class DefinitionRunOn {
    @XmlElement(name = "dre")
    List<SimpleType> dre;

    @XmlElement (name = "def")
    List<Definition> definition;

    @XmlElement(name="gram")
    List<SimpleType> gram;

    public List<SimpleType> getDre() {
        return dre;
    }

    public List<Definition> getDefinition() {
        return definition;
    }

    public List<SimpleType> getGram() {
        return gram;
    }
}
