package com.algorithm.arrayAlgo;

import java.util.Scanner;

public class arEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ox받을거
        String arr[] = new String[scanner.nextInt()];


        //for문 돌면서 5개받음
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.next();

        }

        //받은거
        for(int i=0; i<arr.length; i++){
            int cnt = 0;
            int sum = 0;
            for(int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j) == 'O'){
                    cnt++;
                }else{
                    cnt = 0;
                }
                sum+=cnt;
            }
            System.out.println(sum);
        }


    }
}
