package com.javarush.test;

public class Dog {

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            Dog dog = new Dog();
        }
    }
    protected void finalize() throws Throwable{
        System.out.println("A Dog was destroyed");
    }
}
