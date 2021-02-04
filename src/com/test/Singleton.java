package com.test;

public class Singleton {
    private static Singleton instance =new Singleton();

    private static Singleton getInstance(){
        return instance;
    }
    private Singleton(){

    }
}
