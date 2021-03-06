package com.test;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Potoki23Interrupted {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }
    public static class Read3Strings extends Thread{
        public String s = "";
        @Override
        public void run() {
                try {
                    s += reader.readLine() + " ";
                    s += reader.readLine() + " ";
                    s += reader.readLine();

                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
    public void printResult(){
        System.out.println(s);
        }
    }
}
