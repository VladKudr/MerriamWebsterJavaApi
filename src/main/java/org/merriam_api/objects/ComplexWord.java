package org.merriam_api.objects;

import java.util.List;

public class ComplexWord {
    private long uniqueIdentifier;
    private List<PhrasalVerb> phrasalVerbList;
    private List<SimpleWord> simpleWords;


    public ComplexWord(List<PhrasalVerb> phrasalVerbList, List<SimpleWord> simpleWords) {
        this.phrasalVerbList = phrasalVerbList;
        this.simpleWords = simpleWords;
    }


    public long getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(long uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public List<PhrasalVerb> getPhrasalVerbList() {
        return phrasalVerbList;
    }

    public List<SimpleWord> getSimpleWords() {
        return simpleWords;
    }
}
