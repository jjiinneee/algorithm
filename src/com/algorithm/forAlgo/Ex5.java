package com.algorithm.forAlgo;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int num = sca.nextInt();

        for (int i = 0; i < num; i++) {
            int a = sca.nextInt();
            int b = sca.nextInt();
            System.out.println("Case #" + i + ": "+ a +"+" + b +" = "+ (a+b));
           // arr[i] = a +b;
        }
        sca.close();


    }
}
