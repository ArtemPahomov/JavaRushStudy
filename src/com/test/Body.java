package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Body {
    public static void calculateMassIndex(double weight,double height){
        double imt = weight/Math.pow(height,2);
         if(imt<18.5){
            System.out.println("Недовес: меньше 18.5");
        }else if(imt>18.5&&imt<25){
             System.out.println("Нормальный: между 18.5 и 25");
         }else if(imt>25&&imt<30){
             System.out.println("Избыточный вес: между 25 и 30");
         }else {
             System.out.println("Ожирение 30 или больше");
         }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double w = Double.parseDouble(reader.readLine());
        double h = Double.parseDouble(reader.readLine());
        calculateMassIndex(66,1.76);
    }
}
