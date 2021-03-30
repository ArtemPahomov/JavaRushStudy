package ru.ivmmit.classes;

public class Human {
    public int Age;
    public String name;

    /*public Human() {
        Age = 1;
        this.name = "DEFAULT_NAME";
    }*/

    public Human(int age, String name) {
        Age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.Age+ " "+this.name;
    }
}
