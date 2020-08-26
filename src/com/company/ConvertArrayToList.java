package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayToList <T>{
    public List<T> convert (T[] arr){
        List<T> tList = new ArrayList<>();
        for (T t: arr){
            tList.add(t);
        }
        return tList;
    }
}
