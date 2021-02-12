package com.test;

public class Potoki25 {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{
        @Override
        public String toString() {
            return getName()+" created";
        }

        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            start();

        }

        @Override
        public void run() {
            while (createdThreadCount<Potoki25.count){
                System.out.println(new GenerateThread());
            }
        }
    }
}
