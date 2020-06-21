package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    String [] words = new String[]{"Batut", "Gorshok", "Botinki", "Batut", "Pistolet", "Obed", "Dom", "Dom", "Pistolet", "Noutbook", "Masha"};
        List<String> listWords = new ArrayList <> (Arrays.asList(words));
        System.out.println(listWords);
        Set<String> uniqueWords = new HashSet<>(listWords);
        System.out.println(uniqueWords);
        Map<String, Integer> mapWords = new HashMap<>();
        for (String count: listWords){
            if (mapWords.containsKey(count)){
                Integer counter = mapWords.get(count);
                counter++;
                mapWords.put(count, counter);
            } else {
                mapWords.put(count, 1);
            }
        }
        System.out.println(mapWords);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Olimov", "+998913131937");
        phonebook.add("Saidov", "+998913134141");
        phonebook.get("Olimov");
        phonebook.add("Olimov", "+998915349896");
        phonebook.get("Olimov");
    }
}
