package com.test;

public class Potoki33SynchronizedPresident {
    public static void main(String[] args) {

        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident==ourPresident);
    }
}
