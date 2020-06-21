package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List> mapNumber = new HashMap<>();

    public void add(String surename, String phonenumber){
        if (mapNumber.containsKey(surename)){
            List<String> listNumber = mapNumber.get(surename);
            listNumber.add(phonenumber);
            mapNumber.put(surename, listNumber);
        } else {
            List<String> listNumber = new ArrayList<>();
            listNumber.add(phonenumber);
            mapNumber.put(surename, listNumber);
        }
        System.out.println(String.format("adding ... surename: %s phone: %s", surename, phonenumber));

    }

    public void get(String surname){
        if (mapNumber.containsKey(surname)){
            System.out.println("phone: "  +mapNumber.get(surname));
        } else {
            System.out.println("not found...");
        }
    }
}
