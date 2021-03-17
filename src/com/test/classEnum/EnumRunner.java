package com.test.classEnum;

import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Season str = Season.valueOf(scanner.nextLine());

        str.nextSeason(str);
    }
}
