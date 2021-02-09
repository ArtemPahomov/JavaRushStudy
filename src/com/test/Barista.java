package com.test;

public class Barista {
    public static void main(String[] args) {
        DrinkMaker latteMaker = new LatteMaker();
        DrinkMaker teaMaker = new TeaMaker();

        latteMaker.makeDrink();
        teaMaker.makeDrink();
    }
}
