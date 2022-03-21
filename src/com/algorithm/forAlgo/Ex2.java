package com.algorithm.forAlgo;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i] = a+b;
        }
        scanner.close();

        for (int number :arr) {
            System.out.println(number);
        }
    }
}
