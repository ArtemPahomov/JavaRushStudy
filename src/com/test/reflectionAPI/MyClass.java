package com.test.reflectionAPI;

import java.lang.reflect.Field;

public class MyClass {

        private String name = "default";
        private int number;
        public MyClass(int number,String name) {
            this.name = name;
            this.number=number;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        private void printData() {
            System.out.println(number + " " + name);
        }
}
