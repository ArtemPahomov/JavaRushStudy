package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgerLoserCoderUser {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        while (true){
            key = reader.readLine();
            if (!key.equals("user") && !key.equals("loser") && !key.equals("coder") && !key.equals("proger")){
                break;
            }
            switch (key){
                case "user":
                    doWork(new Person.User());
                    break;
                case "loser":
                    doWork(new Person.Loser());
                    break;
                case "coder":
                    doWork(new Person.Coder());
                    break;
                case "proger":
                    doWork(new Person.Proger());
                    break;
                default:
                    break;
            }
        }
    }
    public static void doWork(Person person){
        if (person instanceof Person.User){
            ((Person.User) person).live();
        }else if(person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }else if (person instanceof Person.Coder){
            ((Person.Coder) person).writeCode();
        }else if(person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
