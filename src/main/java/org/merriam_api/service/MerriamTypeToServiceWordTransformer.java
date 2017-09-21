package org.merriam_api.service;

import org.merriam_api.objects.*;

import javax.xml.bind.JAXBElement;
import java.io.Serializable;
import java.util.*;

public class MerriamTypeToServiceWordTransformer implements WordTransformer {

    @Override
    public List<SimpleWord> transform(EntryListType entryListType) {

        List<SimpleWord> simpleWords = new ArrayList<>();
        for (EntryType entryType : entryListType.getEntry()) {
            String id = entryType.getHw().getValue();
            String transcription = entryType.getPr();
            String partOfSpeach = entryType.getFl();
            HashMap<String, List<String>> defExamples = new HashMap<>();

            DefType defType = entryType.getDef();
            if (defType != null) {
                defType.getSnOrSgramOrDt().parallelStream().filter(jaxbElement -> jaxbElement.getName().toString().equals("dt"))
                        .forEach(jaxbElement -> {

                            List<Serializable> elements = ((DtType) jaxbElement.getValue()).getContent();

                            String previousDefinition = null;
                            List<String> examples = new ArrayList<>();
                            for (Serializable dt : elements) {
                                if (dt.getClass() == java.lang.String.class) {
                                    if (!dt.equals(" ")) {
                                        previousDefinition = (String) dt;
                                    }
                                } else {
                                    try {
                                        examples.add((String) (((ViType) ((JAXBElement) dt).getValue()).getContent().get(0)));
                                    } catch (Exception e) {
                                        try {
                                            UnType unType = (((UnType) ((JAXBElement) dt).getValue()));
                                            unType.getContent().stream().filter((unTypeElement) -> unTypeElement.getClass() == JAXBElement.class).forEach(viElement -> {
                                                ViType viType = (ViType) ((JAXBElement) viElement).getValue();
                                                examples.add((String) viType.getContent().get(0));
                                            });

                                        } catch (Exception exr) {

                                            //ignore dxr
                                        }
                                    }

                                }


                            }

                            if (previousDefinition != null) {
                                defExamples.put(previousDefinition, examples);
                            }

                        });

                SimpleWord simpleWord = new SimpleWord(id, defExamples);
                simpleWord.setTranscription(transcription);
                simpleWord.setPartOfSpeach(partOfSpeach);

                simpleWords.add(simpleWord);
            }
        }

        return simpleWords;
    }


    @Override
    public List<PhrasalVerb> transformPhrasal(EntryListType entryListType) {
        List<PhrasalVerb> phrasalVerbs = new ArrayList<>();
        for (EntryType entryType : entryListType.getEntry()) {

            List<DroType> listDroPhrases = entryType.getDro();
            if (listDroPhrases != null) {

                listDroPhrases.forEach(phrase -> {
                    HashMap<String, List<String>> defExamples = new HashMap<>();

                    String id = phrase.getDre();
                    phrase.getDef().getSnOrSgramOrDt().parallelStream().filter(jaxbElement -> jaxbElement.getName().toString().equals("dt"))
                            .forEach(jaxbElement -> {

                                List<Serializable> elements = ((DtType) jaxbElement.getValue()).getContent();

                                String previousDefinition = null;
                                List<String> examples = new ArrayList<>();
                                for (Serializable dt : elements) {
                                    if (dt.getClass() == java.lang.String.class) {
                                        if (!dt.equals(" ")) {
                                            previousDefinition = (String) dt;
                                        }
                                    } else {

                                        StringBuilder exampleBuild = new StringBuilder();
                                        try {
                                            ((UnType) ((JAXBElement) dt).getValue()).getContent().forEach((serializableElement) -> {
                                                String result;
                                                try {
                                                    result = (String) serializableElement;
                                                } catch (Exception ex) {
                                                    result = (String) ((ViType) ((JAXBElement) serializableElement).getValue()).getContent().get(0);
                                                }
                                                exampleBuild.append(result).append(":");
                                            });
                                        } catch (Exception ex) {
                                            try {
                                                ViType viType = (ViType) ((JAXBElement) dt).getValue();
                                                exampleBuild.append((String) viType.getContent().get(0));
                                            } catch (Exception ec) {

                                            }
                                        }
                                        examples.add(exampleBuild.toString());


                                    }


                                }

                                if (previousDefinition != null) {
                                    defExamples.put(previousDefinition, examples);
                                }
                            });


                    PhrasalVerb phrasalVerb = new PhrasalVerb(id, defExamples);
                    phrasalVerbs.add(phrasalVerb);
                });
            }
        }
//                System.out.println(droType);
//                droType.stream().filter(jaxbElement -> jaxbElement.getName().toString().equals("dt"))
//                        .forEach(jaxbElement -> {
//
//                            List<Serializable> elements = ((DtType) jaxbElement.getValue()).getContent();
//
//                            String previousDefinition = null;
//                            List<String> examples = new ArrayList<>();
//                            for (Serializable dt : elements) {
//                                if (dt.getClass() == java.lang.String.class) {
//                                    if (!dt.equals(" ")) {
//                                        previousDefinition = (String) dt;
//                                    }
//                                } else {
//                                    try {
//                                        examples.add((String) (((ViType) ((JAXBElement) dt).getValue()).getContent().get(0)));
//                                    } catch (Exception e) {
//                                        try {
//                                            UnType unType = (((UnType) ((JAXBElement) dt).getValue()));
//                                            unType.getContent().stream().filter((unTypeElement) -> unTypeElement.getClass() == JAXBElement.class).forEach(viElement -> {
//                                                ViType viType = (ViType) ((JAXBElement) viElement).getValue();
//                                                examples.add((String) viType.getContent().get(0));
//                                            });
//
//                                        } catch (Exception exr) {
//
//                                            //ignore dxr
//                                        }
//                                    }
//
//                                }
//
//
//                            }
//
//                            if (previousDefinition != null) {
//                                defExamples.put(previousDefinition, examples);
//                            }
//
//                        });
//
//                SimpleWord simpleWord = new SimpleWord(id, defExamples);
//                simpleWord.setTranscription(transcription);
//                simpleWord.setPartOfSpeach(partOfSpeach);
//
//                simpleWords.add(simpleWord);


        return phrasalVerbs;
    }
}
