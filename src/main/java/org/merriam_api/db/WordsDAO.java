package org.merriam_api.db;

import org.merriam_api.objects.ComplexWord;
import org.merriam_api.objects.PhrasalVerb;
import org.merriam_api.objects.SimpleWord;

import java.util.List;

public interface WordsDAO {
    public void saveWord(ComplexWord complexWord);

    public ComplexWord getWord(String infinitiveForm);
}
