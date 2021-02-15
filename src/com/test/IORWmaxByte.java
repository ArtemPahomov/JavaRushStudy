package com.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IORWmaxByte {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int max = 0;
        int current;

        while (inputStream.available()>0){
            current=inputStream.read();
            if (current>max){
                max=current;
            }
        }
        reader.close();
        inputStream.close();
        System.out.println(max);
    }
}
