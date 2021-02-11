package com.test;

public class LiteTask {

    public static class Test extends Thread{
        @Override
        public void run() {
            System.out.println("My name is " + getName());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Test thread = new Test();
            thread.start();
        }
    }
}
