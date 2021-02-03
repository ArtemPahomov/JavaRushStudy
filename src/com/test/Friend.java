package com.javarush.test;

public class Friend {
    String name;
    int age;
    char sex;

    public Friend(String name,int age,char sex){
        this.age=age;
        this.name=name;
        this.sex=sex;
    }public Friend(String name,int age){
        this.age=age;
        this.name=name;
    }public Friend(String name){
        this.name=name;
    }
}
