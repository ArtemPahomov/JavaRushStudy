package com.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;

public class ExceptionExampleOriginal {
    public static void main(String[] args)  {
        readDate();
    }
    public static void readDate(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>list = new ArrayList<>();
        try {
            String s;
            while (true){
                s=reader.readLine();
                list.add(Integer.parseInt(s));
            }
        }catch (Exception e){
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }
}