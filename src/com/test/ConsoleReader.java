package com.javarush.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ConsoleReader {

    public static String readString() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static int readInt() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int numInt = Integer.parseInt(reader.readLine());
        return Integer.parseInt(reader.readLine());
    }
    public static double readDouble() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(reader.readLine());
    }
    public static boolean readBoolean() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(reader.readLine());
    }
}
