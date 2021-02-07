package com.test;

import javax.crypto.spec.PSource;

public class AutoCheepOrLux {
    public static void main(String[] args) {
        new AutoCheepOrLux.LuxuriousCar().printlnDesire();
        new AutoCheepOrLux.CheapCar().printlnDesire();
        new AutoCheepOrLux.Ferrari().printlnDesire();
        new AutoCheepOrLux.Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar{
        public void printlnDesire() {
            System.out.println(WANT_STRING+FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            System.out.println(WANT_STRING+LANOS_NAME);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }

    public static class LuxuriousCar extends Constants{
       protected void printlnDesire(){
           System.out.println(WANT_STRING+LUXURIOUS_CAR);
       }
    }
    public static class CheapCar extends Constants{
        protected void printlnDesire(){
            System.out.println(WANT_STRING+CHEAP_CAR);
        }
    }
}
