package org.merriam_api;

import org.merriam_api.db.WordsDAO;
import org.merriam_api.objects.ComplexWord;
import org.merriam_api.objects.PhrasalVerb;
import org.merriam_api.objects.SimpleWord;
import org.merriam_api.service.MerriamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = "org.merriam_api")
public class Application implements CommandLineRunner {


    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("Start sample application");

        new SpringApplicationBuilder(Application.class)
                .web(false)
                .run(args);
    }


    @Autowired
    WordsDAO wordsDAO;


    @Override
    public void run(String... strings) throws Exception {

        final String authUser = "myuser";
        final String authPassword = "secret";


        System.setProperty("http.proxyHost", "msk-proxy.ftc.ru");
        System.setProperty("http.proxyPort", "3128");
//        System.setProperty("http.proxyUser", authUser);
//        System.setProperty("http.proxyPassword", authPassword);
        MerriamService merriamService = new MerriamService("4d0a2da0-791e-4616-986f-2b26da530f04");
//        merriamService.explainTheWord("taken");


        List<PhrasalVerb> phrasalVerbs = merriamService.getPhrasalVerbs("take", 10);
        List<SimpleWord> simpleWords = merriamService.getDefinition("take", 10);
        ComplexWord complexWord = new ComplexWord(phrasalVerbs,simpleWords );
//        wordsDAO.saveComplexWord(complexWord);
       SimpleWord simpleWord =  wordsDAO.getSimpleWord("brake");
        System.out.println(simpleWords.size());

    }
}
