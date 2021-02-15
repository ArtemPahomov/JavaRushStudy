package com.test;

import java.io.*;

public class IORWsplit2files {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outPutFile1 = reader.readLine();
        String outPutFile2 = reader.readLine();

        try(FileInputStream inputStream = new FileInputStream(inputFile);
            FileOutputStream outputStream1 = new FileOutputStream(outPutFile1);
            FileOutputStream outputStream2 = new FileOutputStream(outPutFile2)){
            if(inputStream.available()>0){
                byte[] inputByte = new byte[inputStream.available()];
                System.out.println(inputByte.length);
                int firsHalf  = inputByte.length/2;
                if(!(inputByte.length%2==0)){
                    firsHalf+=1;
                }
                System.out.println(firsHalf);
                int lastHalf =  inputByte.length-firsHalf;


                outputStream1.write(inputByte,0,firsHalf);
                outputStream2.write(inputByte,firsHalf,lastHalf);
            }
        }
    }
}
