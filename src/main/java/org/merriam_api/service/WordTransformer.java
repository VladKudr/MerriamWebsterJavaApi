package org.merriam_api.service;

import org.merriam_api.objects.EntryListType;
import org.merriam_api.objects.PhrasalVerb;
import org.merriam_api.objects.SimpleWord;

import java.util.List;

public interface WordTransformer {
    public List<SimpleWord> transform(EntryListType entryListType);

    List<PhrasalVerb> transformPhrasal(EntryListType entryListType);
}
