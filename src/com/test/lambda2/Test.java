package com.test.lambda2;

public class Test {
    public static void main(String[] args) {

        TestInfereceType tit = new TestInfereceType();

    }
}
class TestInfereceType{
}
interface I{
    void abc();
    default void def(){}
    default void def2(){}
    static void def3(){}
}