package org.merriam_api.objects;

import java.util.List;
import java.util.Map;

public class PhrasalVerb extends Word{

    public PhrasalVerb(String id, Map<String, List<String>> definitionsAndExamples) {
        this.id = id;
        this.definitionsAndExamples = definitionsAndExamples;
    }
}
