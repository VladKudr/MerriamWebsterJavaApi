package org.merriam_api.db;

import org.merriam_api.objects.ComplexWord;
import org.merriam_api.objects.PhrasalVerb;
import org.merriam_api.objects.SimpleWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class WordDAOImpl implements WordsDAO {


    private static final String SQL_SELECT_PHRASAL_VERB = "SELECT * FROM PHRASAL_VERB WHERE id = ?";
    private static final String SQL_SELECT_WORD = "SELECT * FROM WORD WHERE id = ?";

    private JdbcTemplate jdbcTemplate;
    private String SQL_INSERT_SIMPLE_WORD = "INSERT INTO WORD(uniqueVal, id, transcription, part, definition, example ) VALUES (?,?,?,?,?,?)";
    private String SQL_INSERT_PHRASAL_VERB = "INSERT INTO PHRASAL_VERB(uniqueVal, id, definition, example) VALUES (?,?,?,?)";


    @Override
    public void saveComplexWord(ComplexWord complexWord) {

        complexWord.getPhrasalVerbList().stream().forEach((this::saveRecordPhrasalWord));
        complexWord.getSimpleWords().stream().forEach(this::saveRecordSimpleWord);

    }

    private void saveRecordSimpleWord(SimpleWord simpleWord) {
        String id = simpleWord.getId();
        String transcription = simpleWord.getTranscription();
        String partOfSpeach = simpleWord.getPartOfSpeach();


        simpleWord.getDefinitionsAndExamples().forEach((definition, examples) -> {
            examples.forEach((example) -> {

                int uniqueValue = definition.hashCode() + example.hashCode();
                Object[] argsSimpleWord = new Object[]{uniqueValue, id, transcription, partOfSpeach, definition, example};

                try {
                    jdbcTemplate.update(SQL_INSERT_SIMPLE_WORD, argsSimpleWord);
                } catch (DuplicateKeyException e) {

                }
            });


        });
    }


    private void saveRecordPhrasalWord(PhrasalVerb phrasalVerb) {
        String id = phrasalVerb.getId();
        phrasalVerb.getDefinitionsAndExamples().forEach((definition, examples) -> {


            examples.forEach((example) -> {
                int uniqueValue = definition.hashCode() + example.hashCode();
                Object[] argsPhrasal = new Object[]{uniqueValue, id, definition, example};
                try {
                    jdbcTemplate.update(SQL_INSERT_PHRASAL_VERB, argsPhrasal);

                } catch (DuplicateKeyException e) {

                }
            });


        });
    }


    @Override
    public ComplexWord getComplexWord(String infinitiveForm) {
        return null;
    }

    @Override
    public PhrasalVerb getPhrasalVerb(String phrasalVerb) {

        List<Map<String, Object>> results = jdbcTemplate.queryForList(SQL_SELECT_PHRASAL_VERB, phrasalVerb);
        if (results.size() == 0){
            return null;
        }
        Map<String, List<String>> def = getDefExamplesFromSQLRow(results);


        PhrasalVerb phrVerb = new PhrasalVerb(phrasalVerb, def);

        return phrVerb;
    }

    @Override

    public SimpleWord getSimpleWord(String infinitiveForm) {
        List<Map<String, Object>> result = jdbcTemplate.queryForList(SQL_SELECT_WORD, infinitiveForm);
        if (result.size() == 0){
            return null;
        }
        Map<String, List<String>> def;
        def = getDefExamplesFromSQLRow(result);


        SimpleWord simpleWord = new SimpleWord(infinitiveForm, def);
        Map<String, String> additionalParam = getAdditionalParams(result, "transcription", "part");

        simpleWord.setTranscription(additionalParam.get("transcription"));
        simpleWord.setPartOfSpeach(additionalParam.get("part"));

        return simpleWord;

    }

    private Map<String, String> getAdditionalParams(List<Map<String, Object>> defExampleSQL, String... paramNames) {
        Map<String, String> result = new HashMap<>();
        for (String paramName : paramNames) {
            for (Map<String, Object> obj : defExampleSQL) {

                result.put(paramName, (String) obj.get(paramName));
                break;
            }
        }
        return result;
    }

    private Map<String, List<String>> getDefExamplesFromSQLRow(List<Map<String, Object>> defExampleSQL) {
        Map<String, List<String>> def = new HashMap<>();

        for (Map<String, Object> obj : defExampleSQL) {
            List<String> examples;
            if (!def.containsKey(obj.get("definition"))) {
                examples = new ArrayList<>();
                examples.add((String) obj.get("example"));

            } else {
                examples = def.get(obj.get("definition"));
                examples.add((String) obj.get("example"));
            }
            def.put((String) obj.get("definition"), examples);

        }

        return def;

    }


    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
