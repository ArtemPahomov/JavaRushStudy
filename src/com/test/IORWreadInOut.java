package com.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IORWreadInOut {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile = reader.readLine();

        try (FileInputStream inputStream = new FileInputStream(inputFile);FileOutputStream outputStream = new FileOutputStream(outputFile)){
            List<Integer>list = new ArrayList<>();
            while (inputStream.available()>0){
                list.add(inputStream.read());
            }
            Collections.reverse(list);
            for (Integer integer : list) {
                outputStream.write(integer);
            }
        }
        }
}
