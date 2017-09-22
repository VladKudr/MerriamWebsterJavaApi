package org.merriam_api.objects;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


public class SimpleWord extends Word {

    private String partOfSpeach;
    private String transcription;

    public SimpleWord(String id, Map<String, List<String>> definitionsAndExamples) {

        this.id = id;
        this.definitionsAndExamples = definitionsAndExamples;

    }
    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    public String getId() {
        return id;
    }

    public Map<String, List<String>> getDefinitionsAndExamples() {
        return definitionsAndExamples;
    }

    public void setPartOfSpeach(String partOfSpeach) {
        this.partOfSpeach = partOfSpeach;
    }

    public String getPartOfSpeach() {
        return partOfSpeach;
    }
}
