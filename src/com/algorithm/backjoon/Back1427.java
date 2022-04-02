package com.algorithm.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Back1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.nextLine().toCharArray();


        Arrays.sort(arr);

        for(int i = arr.length -1; i>=0; i--){
            System.out.println(arr[i]);
        }


    }
}
