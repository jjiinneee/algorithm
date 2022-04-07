package com.algorithm.backjoon;

import java.util.Scanner;

public class Back10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int target = scanner.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<length;i++){
            int num = scanner.nextInt();
            if (num < target) stringBuilder.append(num + " ");
        }

        System.out.println(stringBuilder.toString());
    }
}
