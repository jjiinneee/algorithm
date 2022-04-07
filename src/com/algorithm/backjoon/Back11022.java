package com.algorithm.backjoon;

import java.util.Scanner;

public class Back11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] one = new int[num];
        int[] two = new int[num];
        for(int i =0; i< num; i++){
            one[i] = scanner.nextInt();
            two[i] = scanner.nextInt();


        }

        for (int i = 0; i < num; i++) {
            System.out.println("Case #"+(i+1) +": " + one[i] +" + " + two[i] +" = " + (one[i]+two[i]));
        }


    }
}
