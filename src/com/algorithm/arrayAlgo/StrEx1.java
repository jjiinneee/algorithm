package com.algorithm.arrayAlgo;

import java.util.Scanner;

public class StrEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String number =  sc.next();

        int sum = 0;
        for(int i=0; i<num; i++){
            sum+= number.charAt(i) -'0';

        }
        System.out.println(sum);
    }
}
