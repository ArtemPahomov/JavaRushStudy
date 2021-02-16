package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("1+-1+");
        Matcher m = p.matcher("Test1-11string1-11test");
        while (m.find()){
            System.out.println(m.start()+" "+m.end()+" "+m.group());
        }
    }
}
