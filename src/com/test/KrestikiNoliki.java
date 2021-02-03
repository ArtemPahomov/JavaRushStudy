package com.javarush.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KrestikiNoliki {
static String krestOrNull;
static int count=2;
static boolean win = true;
    public static void main(String[] args) throws IOException {
        String [][] pole = new String[][] {{"1","2", "3"},{"4", "5", "6"}, {"7", "8", "9"}};
        System.out.println("Добро пожаловать в игру - Крестики vs Нолики");
        System.out.println("Есть поле 3 на 3 с пронумерованными ячейками");
        printField(pole);
        System.out.println("Игрок 1 крестики");
        System.out.println();
        System.out.println("Игрок 2 нолики");
        System.out.println();
        System.out.println("Игрок 1 - введите номер ячейки для своего хода");

        do {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String shot = reader.readLine();


            switch (shot) {
                case "1":
                    if (pole[0][0].equals("1")) {
                        krestOrNull = count % 2 == 0 ? "x" : "o";
                        pole[0][0] = krestOrNull;
                        if ((pole[0][0].equals(pole[0][1]) && pole[0][0].equals(pole[0][2])) || (pole[0][0].equals(pole[1][0]) && pole[0][0].equals(pole[2][0])) || (pole[0][0].equals(pole[1][1]) && pole[0][0].equals(pole[2][2]))) {
                            printField(pole);
                            System.out.println("Вы выиграли!");
                            win = false;
                        } else {
                            count++;
                            printField(pole);
                            System.out.println("Следующий игрок - выберите номер ячейки для своего хода");
                        }
                    } else {
                        System.out.println("Ячейка уже занята - выберите другую");
                    }
                    break;
                case "2":
                    if (pole[0][1].equals("2")) {
                        krestOrNull = count % 2 == 0 ? "x" : "o";
                        pole[0][1] = krestOrNull;
                        if ((pole[0][1].equals(pole[0][0]) && pole[0][1].equals(pole[0][2])) || (pole[0][1].equals(pole[1][1]) && pole[0][1].equals(pole[2][1]))) {
                            printField(pole);
                            System.out.println("Вы выиграли!");
                            win = false;
                        } else {
                            count++;
                            printField(pole);
                            System.out.println("Следующий игрок - выберите номер ячейки для своего хода");
                        }
                    } else {
                        System.out.println("Ячейка уже занята - выберите другую");
                    }
                    break;
                case "3":
                    if (pole[0][2].equals("3")) {
                        krestOrNull = count % 2 == 0 ? "x" : "o";
                        pole[0][2] = krestOrNull;
                        if ((pole[0][2].equals(pole[0][1]) && pole[0][2].equals(pole[0][0])) || (pole[0][2].equals(pole[1][1]) && pole[0][2].equals(pole[2][0])) || (pole[0][2].equals(pole[1][2]) && pole[0][2].equals(pole[2][2]))) {
                            printField(pole);
                            System.out.println("Вы выиграли!");
                            win = false;
                        } else {
                            count++;
                            printField(pole);
                            System.out.println("Следующий игрок - выберите номер ячейки для своего хода");
                        }
                    } else {
                        System.out.println("Ячейка уже занята - выберите другую");
                    }
                    break;
                case "4":
                    if (pole[1][0].equals("4")) {
                        krestOrNull = count % 2 == 0 ? "x" : "o";
                        pole[1][0] = krestOrNull;
                        if ((pole[1][0].equals(pole[1][1]) && pole[1][0].equals(pole[1][2])) || (pole[1][0].equals(pole[0][0]) && pole[1][0].equals(pole[2][0]))) {
                            printField(pole);
                            System.out.println("Вы выиграли!");
                            win = false;
                        } else {
                            count++;
                            printField(pole);
                            System.out.println("Следующий игрок - выберите номер ячейки для своего хода");
                        }
                    } else {
                        System.out.println("Ячейка уже занята - выберите другую");
                    }
                    break;
                case "5":
                    if (pole[1][1].equals("5")) {
                        krestOrNull = count % 2 == 0 ? "x" : "o";
                        pole[1][1] = krestOrNull;
                        if ((pole[1][1].equals(pole[1][0]) && pole[1][1].equals(pole[1][2])) || (pole[1][1].equals(pole[0][1]) && pole[1][1].equals(pole[2][1]))) {
                            printField(pole);
                            System.out.println("Вы выиграли!");
                            win = false;
                        } else {
                            count++;
                            printField(pole);
                            System.out.println("Следующий игрок - выберите номер ячейки для своего хода");
                        }
                    } else {
                        System.out.println("Ячейка уже занята - выберите другую");
                    }
                    break;
                case "6":
                    if (pole[1][2].equals("6")) {
                        krestOrNull = count % 2 == 0 ? "x" : "o";
                        pole[1][2] = krestOrNull;
                        if ((pole[1][2].equals(pole[0][2]) && pole[1][2].equals(pole[2][2])) || (pole[1][2].equals(pole[1][1]) && pole[1][2].equals(pole[1][0]))) {
                            printField(pole);
                            System.out.println("Вы выиграли!");
                            win = false;
                        } else {
                            count++;
                            printField(pole);
                            System.out.println("Следующий игрок - выберите номер ячейки для своего хода");
                        }
                    } else {
                        System.out.println("Ячейка уже занята - выберите другую");
                    }
                    break;
                case "7":
                    if (pole[2][0].equals("7")) {
                        krestOrNull = count % 2 == 0 ? "x" : "o";
                        pole[2][0] = krestOrNull;
                        if ((pole[2][0].equals(pole[0][0]) && pole[2][0].equals(pole[1][0])) || (pole[2][0].equals(pole[2][1]) && pole[2][0].equals(pole[2][2])) || (pole[2][0].equals(pole[1][1]) && pole[2][0].equals(pole[0][2]))) {
                            printField(pole);
                            System.out.println("Вы выиграли!");
                            win = false;
                        } else {
                            count++;
                            printField(pole);
                            System.out.println("Следующий игрок - выберите номер ячейки для своего хода");
                        }
                    } else {
                        System.out.println("Ячейка уже занята - выберите другую");
                    }
                    break;
                case "8":
                    if (pole[2][1].equals("8")) {
                        krestOrNull = count % 2 == 0 ? "x" : "o";
                        pole[2][1] = krestOrNull;
                        if ((pole[2][1].equals(pole[2][0]) && pole[2][1].equals(pole[2][2])) || (pole[2][1].equals(pole[1][1]) && pole[2][1].equals(pole[0][1]))) {
                            printField(pole);
                            System.out.println("Вы выиграли!");
                            win = false;
                        } else {
                            count++;
                            printField(pole);
                            System.out.println("Следующий игрок - выберите номер ячейки для своего хода");
                        }
                    } else {
                        System.out.println("Ячейка уже занята - выберите другую");
                    }
                    break;
                case "9":
                    if (pole[2][2].equals("9")) {
                        krestOrNull = count % 2 == 0 ? "x" : "o";
                        pole[2][2] = krestOrNull;
                        if ((pole[2][2].equals(pole[1][1]) && pole[2][2].equals(pole[0][0])) || (pole[2][2].equals(pole[2][1]) && pole[2][2].equals(pole[2][0])) || (pole[2][2].equals(pole[1][2]) && pole[2][2].equals(pole[0][2]))) {
                            printField(pole);
                            System.out.println("Вы выиграли!");
                            win = false;
                        } else {
                            count++;
                            printField(pole);
                            System.out.println("Следующий игрок - выберите номер ячейки для своего хода");
                        }
                    } else {
                        System.out.println("Ячейка уже занята - выберите другую");
                    }
                    break;
                default:
                    System.out.println("Ячейки с таким номером не существует");
                    System.out.println("Выберите другую ячейку");
            }

        }while ((pole[0][0].equals("1") || pole[0][1].equals("2") || pole[0][2].equals("3") || pole[1][0].equals("4") || pole[1][1].equals("5") || pole[1][2].equals("6") || pole[2][0].equals("7") || pole[2][1].equals("8") || pole[2][2].equals("9"))&& win);


        }
    static void printField(String [][] arr){
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}