package com.javarush.test;

public class Util {
    public static double getDistance(int x1,int y1,int x2,int y2){

        double distance= Math.sqrt(Math.pow(y1-y2,2)+Math.pow(x1-x2,2));

        return distance;

    }

    public static void main(String[] args) {

    }
}
