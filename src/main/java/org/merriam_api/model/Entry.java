package org.merriam_api.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by kudrjavtsev on 28/09/2016.
 * MerriamWebsterJavaApi
 */
public class Entry {
    @XmlElement(name="art")
    protected Art art;


    @XmlElement(name="sound")
    protected Sound sound;

    @XmlElement(name="hw")
    protected String headWord;

    @XmlElement(name="pr")
    protected String pronunciation;

    @XmlElement(name = "fl")
    protected String functionLabel ;

    @XmlElement(name = "def")
    List<Definition> definitionField;

    @XmlElement(name = "dro")
    List<DefinitionRunOn> definedRunOn;

    public Art getArt() {
        return art;
    }

    public Sound getSound() {
        return sound;
    }

    public String getHeadWord() {
        return headWord;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public String getFunctionLabel() {
        return functionLabel;
    }

    public List<Definition> getDefinitionField() {
        return definitionField;
    }

    public List<DefinitionRunOn> getDefinedRunOn() {
        return definedRunOn;
    }
}
