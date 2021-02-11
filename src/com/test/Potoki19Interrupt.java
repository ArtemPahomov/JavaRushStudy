package com.test;

public class Potoki19Interrupt {
    static int count = 5;

    public static void main(String[] args) throws InterruptedException {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();// запустили нить с объектом ThreadNamePrinter, Run которого 5 раз выполнит printMsg
        tnp.join();
        for (int i = 0; i < count; i++) {//main вызывает 5 раз printMsg
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            Thread t = Thread.currentThread();
            String name = t.getName();
            System.out.println("Name=" + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
