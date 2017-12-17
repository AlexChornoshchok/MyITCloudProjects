package com.ua.LabWork2.collection;

import java.util.HashMap;

public class MyTranslator {
    protected HashMap <String, String> myHashMap = new HashMap<>();

    public void addNewWord(String eng, String rus){
        this.myHashMap.put(eng, rus);
    }

    public String translate(String eng){
        return "\"" + eng + "\""+ " ... " + "\""+ myHashMap.get(eng) + "\"";
    }
}
