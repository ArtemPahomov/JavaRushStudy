package com.test;

public class Potoki31Synchronized {
    public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund==anotherFund);
    }
}
