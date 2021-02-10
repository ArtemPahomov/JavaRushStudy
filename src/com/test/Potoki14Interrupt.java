package com.test;

public class Potoki14Interrupt {
    public static void main(String[] args) {
        TestThread t = new TestThread();
        t.start();
        t.interrupt();
    }
    private static class TestThread extends Thread{
        public void Run(){

        }
    }
}
