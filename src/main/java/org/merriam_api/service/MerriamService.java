package org.merriam_api.service;

import org.merriam_api.objects.EntryListType;
import org.merriam_api.objects.PhrasalVerb;
import org.merriam_api.objects.SimpleWord;
import org.merriam_api.spring.RestTemplateMerriam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriTemplateHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kudrjavtsev on 28/09/2016.
 * MerriamWebsterJavaApi
 */
public class MerriamService implements MerriamServiceInterface {

    private WordTransformer wordTransformer = new MerriamTypeToServiceWordTransformer();


    @Override
    public List<SimpleWord> getDefinition(String word, int upperRestriction) {
        return wordTransformer.transform(explainTheWord(word));
    }

    @Override
    public List<PhrasalVerb> getPhrasalVerbs(String word, int upperRestriction) {
        return wordTransformer.transformPhrasal(explainTheWord(word));
    }

    @Override
    public List<String> getExamplesOfUsing(String word, int upperRestriction) {
        return null;
    }

    protected String key;
    private final String merriamUrlMask = "http://www.dictionaryapi.com/api/v1/references/learners/xml/{word}?key={key}";

    public MerriamService(String key) {
        this.key = key;
    }

    private EntryListType explainTheWord(String word) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Type", "application/xml");

        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);

        RestTemplate restTemplate = new RestTemplateMerriam();


        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("word", word);
        uriVariables.put("key", key);


        ResponseEntity<EntryListType> responseEntity = restTemplate.exchange(new DefaultUriTemplateHandler().expand("http://www.dictionaryapi.com/api/v1/references/learners/xml/{word}?key={key}", uriVariables).toString(), HttpMethod.GET, entity, EntryListType.class);


        System.out.println(responseEntity);
        return responseEntity.getBody();
    }

    public static void main(String[] args) {

        final String authUser = "myuser";
        final String authPassword = "secret";


//        System.setProperty("http.proxyHost", "msk-proxy.ftc.ru");
//        System.setProperty("http.proxyPort", "3128");
//        System.setProperty("http.proxyUser", authUser);
//        System.setProperty("http.proxyPassword", authPassword);
        MerriamService merriamService = new MerriamService("4d0a2da0-791e-4616-986f-2b26da530f04");
//        merriamService.explainTheWord("taken");


        List<PhrasalVerb> phrasalVerbs = merriamService.getPhrasalVerbs("take", 10);
        List<SimpleWord> simpleWords = merriamService.getDefinition("take", 10);

        System.out.println(simpleWords.size());
        System.out.println(phrasalVerbs.size());
    }
}
