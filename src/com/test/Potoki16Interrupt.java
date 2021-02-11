package com.test;

public class Potoki16Interrupt {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }
        public static volatile boolean stopProgramm;
    public static void ourInterruptMethod() {
        stopProgramm=true;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (!stopProgramm) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
