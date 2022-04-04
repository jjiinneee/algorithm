package com.algorithm.backjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Back1181 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String[] arr = new String[num];

        for(int i=0; i<num;i++){
            arr[i] = scanner.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               if(o1.length() == o2.length()){
                   return o1.compareTo(o2);
               }else{
                   return o1.length() - o2.length();
               }
            }
        });

        System.out.println(arr[0]);

        for(int i=0; i<num; i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }
}
