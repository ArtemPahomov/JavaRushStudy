package com.javarush.test;

import java.io.IOException;
import java.util.*;

public class Cat {

    String name;
    public Cat(String name){
        this.name=name;
    }
    public String toString(){
        return "Cat " + this.name;
    }


    public static void main(String[] args) {
            Map<String,Cat> map = createMap();
            Set<Cat> set = convertMapToSet(map);
            printSet(set);
        }


    public static HashMap<String,Cat> createMap(){
        HashMap<String,Cat> map = new HashMap<>();
        map.put("барсик",new Cat("barsik"));
        map.put("miay",new Cat("miay"));
        map.put("kot",new Cat("kot"));
        map.put("kis",new Cat("kisa"));
        return map;

    }
    public static Set<Cat> convertMapToSet(Map<String,Cat> map){
        return new HashSet<>(map.values());
    }
    public static void printSet(Set<Cat>set){
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }
}


