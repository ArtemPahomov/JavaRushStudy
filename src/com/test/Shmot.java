package com.test;

public class Shmot {
    public static void main(String[] args) {

    }
    public interface Movable{
        boolean isMovable();
    }
    public interface Sellable{
        Object getAllowedAction(String name);
    }
    public interface Discountable{
        Object getAllowedAction();
    }
    public static class Clothes implements Movable, Sellable, Discountable{

        @Override
        public boolean isMovable() {
            return false;
        }

        @Override
        public Object getAllowedAction(String name) {
            return null;
        }

        @Override
        public Object getAllowedAction() {
            return null;
        }
    }
}
