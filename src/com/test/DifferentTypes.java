package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DifferentTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s= reader.readLine()).equals("exit")){
            try {
                if (s.contains(".")){
                    print(Double.parseDouble(s));
                }else{
                    int i = Integer.parseInt(s);
                    if (i>0&&i<128){
                        print((short)i);
                    }else {
                        print(i);
                    }
                }
            }catch (Exception e){
                print(s);
            }
        }
        reader.close();
    }
    public static void print(Double value){
        System.out.println("Этот тип Double, значение "+value);
    }
    public static void print(String value){
        System.out.println("Этот тип String, значение "+value);
    }
    public static void print(short value){
        System.out.println("Этот тип short, значение "+value);
    }
    public static void print(Integer value){
        System.out.println("Этот тип Integer, значение "+value);
    }
}
