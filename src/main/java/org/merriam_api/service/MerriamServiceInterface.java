package org.merriam_api.service;

import org.merriam_api.objects.PhrasalVerb;
import org.merriam_api.objects.SimpleWord;

import java.util.List;

public interface MerriamServiceInterface {

    public List<SimpleWord> getDefinition(String word, int upperRestriction);

    public List<PhrasalVerb> getPhrasalVerbs(String word, int upperRestriction);

    public List<String> getExamplesOfUsing(String word, int upperRestriction);

}
