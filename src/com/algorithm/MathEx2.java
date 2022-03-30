package com.algorithm;

import java.util.Scanner;

public class MathEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = factorial(num);
        System.out.println(sum);


    }

    public static int factorial(int num){
        if(num <=1) return 1;

        return num * factorial(num -1);

    }
}
