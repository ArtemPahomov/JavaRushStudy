package com.javarush.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WinnerController {




    public static void main(String[] args) throws IOException {

        String [][] pole = new String[][] {{"1","1", "3"},{"4", "5", "6"}, {"7", "8", "9"}};
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String shot = reader.readLine();
        if (shot.equals("1")){
            System.out.println("равны");

        }else {
            System.out.println("не равны");
        }

    }



}
