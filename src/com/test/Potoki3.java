package com.test;

public class Potoki3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }

    }
    public static class SpecialThread extends Potoki implements Runnable{

        @Override
        public void run() {

            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }
    }
}
