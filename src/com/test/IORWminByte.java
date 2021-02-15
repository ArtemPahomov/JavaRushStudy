package com.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class IORWminByte {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer>list = new ArrayList<>();
        while (inputStream.available()>0) {
            int date = inputStream.read();
            list.add(date);
        }
        inputStream.close();
        reader.close();
        int min = Collections.min(list);
        System.out.println(min);
    }
}
