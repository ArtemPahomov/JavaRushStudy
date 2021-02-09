package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.test.Planet.*;

public class MoonSunEarth {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;
    static {
        try {
            readFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromConsoleAndInitPlanet() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        switch (s){
            case EARTH:
                thePlanet=Earth.getInstance();
                break;
            case MOON:
                thePlanet=Moon.getInstance();
                break;
            case SUN:
                thePlanet=Sun.getInstance();
                break;
            default:
                thePlanet=null;
                break;
        }

    }
}
