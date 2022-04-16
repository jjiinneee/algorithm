package com.algorithm.dongyang;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {39,41,53,55,68,72,84,88,92,97};

        int x;
        int pos;
        int left;
        int right;
        int middle;

        System.out.println("x == ");

        x =  sc.nextInt();
        pos = -1;
        left = 0;
        right = a.length - 1;
        sc.close();

        while(pos == -1 && left <= right){
            middle = (left + right) / 2;
            if(a[middle] == x){
                pos = middle;
            } else if (a[middle] > x) {
                right = middle -1;
            }else{
                left = middle + 1;
            }
        }

        System.out.println(pos);
    }
}
