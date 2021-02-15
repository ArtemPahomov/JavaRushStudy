package com.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class IORWsoretedByte {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int num;
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream.available()>0){
            num = inputStream.read();
            if(!list.contains(num)){
                list.add(num);
            }
        }
        reader.close();
        inputStream.close();
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
    }
}
