package com.test;

import java.io.FileOutputStream;
import java.io.IOException;

public class IORWcreateNewFile {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream  = new FileOutputStream("C:\\Users\\teaman\\Desktop\\2.txt");
        String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!";

        outputStream.write(greetings.getBytes());
        outputStream.close();
    }
}
