package org.merriam_api.objects;

import java.util.List;
import java.util.Map;

public abstract class Word {
    protected String id;
    protected String transcription;

    protected Map<String, List<String>> definitionsAndExamples;
}
