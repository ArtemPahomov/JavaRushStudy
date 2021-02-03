package com.javarush.test;

public class Field {

int i;
int j;

        public Field(int i, int j){
        int field [][] = new int[i][j];

    }
        static void printField(){
        int [][] arr = new int[3][3];
    for (int i1 = 0; i1 < arr.length; i1++) {
        for (int k = 0; k < arr[i1].length; k++) {
            System.out.print("%d "+arr[i1][k]);
        }
        System.out.println();
    }
}


}
