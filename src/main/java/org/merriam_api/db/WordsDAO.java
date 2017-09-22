package org.merriam_api.db;

import org.merriam_api.objects.ComplexWord;
import org.merriam_api.objects.PhrasalVerb;
import org.merriam_api.objects.SimpleWord;

import java.util.List;

public interface WordsDAO {
    public void saveComplexWord(ComplexWord complexWord);

    public ComplexWord getComplexWord(String infinitiveForm);

    public PhrasalVerb getPhrasalVerb (String phrasalVerb);

    public SimpleWord getSimpleWord (String infinitiveForm);


}
