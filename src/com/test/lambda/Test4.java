package com.test.lambda;

public class Test4 {

    static void def(Test5 t){
        System.out.println(t.abc("privet","poka"));
    }

    public static void main(String[] args) {
        def((x,y)->x.length()+y.length());
    }

}

interface Test5{
    int abc (String s1,String s2);
}
