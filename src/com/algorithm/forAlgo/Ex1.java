package com.algorithm.forAlgo;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println( inputNum + "*" + i +"="+ inputNum*i);
        }
    }
}
