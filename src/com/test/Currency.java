package com.test;

import java.util.ArrayList;
import java.util.List;

public class Currency {

    public static void main(String[] args) {
        Person ivan = new Person("иван");
        for (Money money : ivan.allMoney) {
            System.out.println(ivan.name + " имеет заначку в размере"+" "+ money.getAmount()+" "+money.getCurrencyName());
        }
    }
    public static class Person{
        public String name;
        Person(String name){
            this.name = name;
            this.allMoney = new ArrayList<Money>();
           allMoney.add(new Hryvnia(100));
           allMoney.add(new Ruble(1000));
           allMoney.add(new USD(2000));
        }
        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
