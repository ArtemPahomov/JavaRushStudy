package com.test.lambda2;

import com.test.lambda.Predicate;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("kak dela?");
        list.add("vse normalno");

        for (String s : list) {
            Predicate<String> p = z -> {return z.length()>4;};
        }

        /*for (String s : list) {
            System.out.println(s);
        }*/

       /* list.forEach(s -> System.out.println(s));


        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(6);
        al.add(3);
        al.add(5);
        al.add(7);
        al.add(1);
        al.add(4);

        //al.removeIf(integer -> integer%3==0);
        System.out.println(al);

        al.sort((x,y)->-x.compareTo(y));
        System.out.println(al);*/
    }
}