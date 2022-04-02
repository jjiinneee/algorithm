package com.algorithm.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Back2750 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int lineNum = scanner.nextInt();
        int[] num  = new int[lineNum];

        for(int i=0; i<lineNum; i++){
            num[i] =  scanner.nextInt();
        }

        Arrays.sort(num);

        for(int val : num){
            System.out.println(val);
        }

    }
}
