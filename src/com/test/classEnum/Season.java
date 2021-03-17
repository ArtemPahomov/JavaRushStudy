package com.test.classEnum;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public enum Season {
    SPRING("warmAftercCold",92),
    WINTER("cold",91),
    AUTUMN("coldAfterWarm",92),
    SUMMER("cold",92);

    String description;
    int cuntOfDays;

    Season(String description, int cuntOfDays){
        this.description = description;
        this.cuntOfDays = cuntOfDays;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void nextSeason(Season season){
        switch (season){
            case AUTUMN:
                System.out.println(WINTER);
                break;
            case WINTER:
                System.out.println(SPRING);
                break;
            case SPRING:
                System.out.println(SUMMER);
                break;
            case SUMMER:
                System.out.println(AUTUMN);
            default:
                System.out.println("Данные введены не корректно");
        }
    }
}
