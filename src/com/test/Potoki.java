package com.test;

public class Potoki {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        new Thread(thread).start();
    }
    public static class TestThread implements Runnable{

        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
}
