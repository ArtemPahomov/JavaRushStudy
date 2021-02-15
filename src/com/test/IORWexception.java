package com.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IORWexception {
    public static void main(String[] args) throws IOException, DownloadException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String fileName = reader.readLine();
            try(FileInputStream inputStream = new FileInputStream(fileName)){
                if (inputStream.available()<1000) throw new DownloadException();
            }
        }

    }
    public static class DownloadException extends Exception{

    }
}
