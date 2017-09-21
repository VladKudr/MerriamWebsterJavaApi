package org.merriam_api.db;

import org.merriam_api.objects.ComplexWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class WordDAOImpl implements WordsDAO {


    private JdbcTemplate jdbcTemplate;

    @Override
    public void saveWord(ComplexWord complexWord) {

    }

    @Override
    public ComplexWord getWord(String infinitiveForm) {
        return null;
    }


    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
