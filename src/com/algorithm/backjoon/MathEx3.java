package com.algorithm.backjoon;

import java.util.Scanner;

public class MathEx3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(fibonacci(a));
    }

    static int fibonacci(int num){
        if(num ==1) {
            return 1;
        }
        if(num == 0){
            return 0;
        }
        return fibonacci(num-1) +fibonacci(num-2);
    }
}
