package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringHelper {

    public static String multiply(String s, int count) throws IOException {

        String res = "";
        for (int i = 0; i < count; i++) {
            res += s;
        }

        return res;
    }

    public static String multiply(String s) throws IOException {

        return multiply(s,5);
    }

    public static void main(String[] args) {
        String as = "a";
        String res = "";
        for (int i = 0; i < 5; i++) {
            res += as;
        }
        System.out.println(res);
    }

}
