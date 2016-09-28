package org.merriam_api;

import org.merriam_api.model.EntryList;
import org.merriam_api.spring.RestTemplateMerriam;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriTemplateHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kudrjavtsev on 28/09/2016.
 * MerriamWebsterJavaApi
 */
public class MerriamService {

    protected String key;
    private final String merriamUrlMask = "http://www.dictionaryapi.com/api/v1/references/learners/xml/{word}?key={key}";

    public MerriamService(String key) {
        this.key = key;
    }

    public EntryList explainTheWord(String word) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Type", "application/xml");

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);

        RestTemplate restTemplate = new RestTemplateMerriam();


        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("word", word);
        uriVariables.put("key", key);


        ResponseEntity<EntryList> responseEntity = restTemplate.exchange(new DefaultUriTemplateHandler().expand("http://www.dictionaryapi.com/api/v1/references/learners/xml/{word}?key={key}", uriVariables).toString(), HttpMethod.GET, entity, EntryList.class);

        return   responseEntity.getBody();
    }
}
