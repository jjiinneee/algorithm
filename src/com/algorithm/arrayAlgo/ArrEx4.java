package com.algorithm.arrayAlgo;

import java.util.Scanner;

public class ArrEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] scoreNum;

        for(int i=0; i < num;i++){
            int studentNum = scanner.nextInt();
            scoreNum  = new int[studentNum];

            double sum = 0;

            for(int j=0; j<studentNum;j++){
                int value = scanner.nextInt();
                scoreNum[j] = value;
                sum += value;
            }

            double avg = sum/studentNum;
            int count = 0;
            for(int k=0; k< scoreNum.length;k++){
                if(avg < scoreNum[k]){
                   count++;
                }

            }
            double percent = (double) count / studentNum * 100.0;
            System.out.println(String.format("%.3f", percent) + "%");

        }
    }


}
