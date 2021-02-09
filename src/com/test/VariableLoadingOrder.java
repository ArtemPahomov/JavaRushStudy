package com.test;

public class VariableLoadingOrder {

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";

    static {
        init();
    }

    public VariableLoadingOrder() {
        System.out.println("VariableLoadingOrder constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        VariableLoadingOrder s = new VariableLoadingOrder();
    }
    static {
        System.out.println("Static block");
    }

    public static void printAllFields(VariableLoadingOrder obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
