package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println(factorial(input));
    }

    public static String factorial(int n){
        int res = 1;
        if(n>0 && n<=150){
            for (int i = 1; i <= n; i++) {
                res*=i;
            }
        }else if(n<0){
            res=0;
        }else if(n==0){
            res=1;
        }
        String result = Integer.toString(res);
        return result;
    }
}
