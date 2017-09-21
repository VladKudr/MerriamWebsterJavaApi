# Merriam Webster JAVA API

Java API for Merriam Webster Online English dictionary gives developers access to a comrehensive resource of dictionary
and theasaurus content and student-friendly content.


## Features
* Get multiply definitions for the word, and phrasal words and examples of their usage.

## Compability
* Java versions : 1.8 +
* Spring framework: 4.2.7 +
* Git

## Walkthrough

### Check out sources
    git clone https://github.com/VladKudr/MerriamWebsterJavaApi.git

### Contributing
    Contributing are welcome.


### Usage
---------
The "MerriamService" class is a classic one way service class to obtain definition and examples of usage of the searched word.

```` java

        import org.merriam_api.service.MerriamService;
        import org.merriam_api.model.EntryList;
        public class App{
            public static void main (String [] args){
                //Initialize key
                MerriamService dictionaryService = new MerriamService("4d0a2da0-791e-4616-986f-2b26da530f04");

                EntryList entries = dictionaryService.explainTheWord("apple");
                //some activities
                //....
            }
        }
````

### Obtain Merriam Webster API Key
You can obtain your API Key by sign up on Merriam Webster Developer Center (http://www.dictionaryapi.com/)

## Licence
The Merriam Webster Java API is released under version 2.0 of hte [Apache Licence][].

The API is free as long as it for non-commercial use, usage does not exceed 1000 queries per day per API key.
