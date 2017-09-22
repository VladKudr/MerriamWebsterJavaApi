package org.merriam_api.objects;

import java.util.List;
import java.util.Map;

public abstract class Word {
    protected String id;


    protected Map<String, List<String>> definitionsAndExamples;

    public String getId() {
        return id;
    }



    public Map<String, List<String>> getDefinitionsAndExamples() {
        return definitionsAndExamples;
    }
}
