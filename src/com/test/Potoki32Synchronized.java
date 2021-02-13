package com.test;

import java.util.ArrayList;
import java.util.List;

public class Potoki32Synchronized {
    public static void main(String[] args) {

    }
    public static class Garden{
        public final List<String>fruits = new ArrayList<>();
        public final List<String> vegetables = new ArrayList<>();

        public void addFruit(int index, String fruit){
            synchronized (this){
                fruits.add(index,fruit);
            }
        }
        public void addVegetable(int index, String fruit){
            synchronized (this){
                vegetables.add(index,fruit);
            }
        }
        public void removeFruit(int index){
            synchronized (this) {
                fruits.remove(index);
            }
        }
        public void removeVegetable(int index){
            synchronized (this) {
                fruits.remove(index);
            }
        }

    }
}
