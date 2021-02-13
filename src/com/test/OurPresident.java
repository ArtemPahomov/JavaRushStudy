package com.test;

public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }

    static {
        synchronized (OurPresident.class){
            president= new OurPresident();
        }
    }
    public static OurPresident getOurPresident() {
        return president;
    }

}
