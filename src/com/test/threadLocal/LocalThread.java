package com.test.threadLocal;

public class LocalThread {

    public static ThreadLocal<Long>threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.println(threadLocal.get());
            threadLocal.set(Thread.currentThread().getId());
            System.out.println("Thread finished id = " + Thread.currentThread().getId() + " threadLocal var = " + Thread.currentThread().getId());
        };
        Thread myThread = new Thread(runnable,"My thread");
        Thread myThread2 = new Thread(runnable,"My thread2");
        myThread.start();
        myThread2.start();

    }
}