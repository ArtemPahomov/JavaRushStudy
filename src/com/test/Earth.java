package com.test;

public class Earth implements Planet {
    private static Earth instance;

    public Earth() {
    }

    public static Earth getInstance() {
        if (instance==null){
            instance=new Earth();
        }
        return instance;
    }
}
