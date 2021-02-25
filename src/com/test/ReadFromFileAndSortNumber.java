package com.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReadFromFileAndSortNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        Scanner scanner = new Scanner(inputStream);
        List<Integer>list = new ArrayList<>();

        while (scanner.hasNext()){
            int value = scanner.nextInt();
            if(value%2==0) list.add(value);
        }
        Collections.sort(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }
        scanner.close();
        inputStream.close();
    }
}
