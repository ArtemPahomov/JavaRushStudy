package com.test;


import java.util.HashMap;
import java.util.Map;

public class Solution {
     public static class Cat{
         public String name;
     }

    private static Cat cat;

    static {
         Cat cat = new Cat();
         cat.name = "пушок";
         Solution.cat = cat;
        System.out.println(cat.name);
     }

    public static void main(String[] args) {
        System.out.println(cat);
    }
}


