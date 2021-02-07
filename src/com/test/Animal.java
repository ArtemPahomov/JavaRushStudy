package com.test;

public class Animal {

    public static class Goose extends SmallAnimal{
        public String getSize(){
            return "Гусь маленький "+ super.getSize();
        }
    }

    public static class Dragon extends BigAnimal{
        public String getSize(){
            return "Дракон большой "+super.getSize();
        }
    }

    public static void main(String[] args) {
        SmallAnimal goose = new Goose();
        System.out.println(goose.getSize());
    }

    public static class BigAnimal{
        protected String getSize(){
            return "как динозавр";
        }
    }

    public static class SmallAnimal{
        String getSize(){
            return "как кошка";
        }
    }
}
