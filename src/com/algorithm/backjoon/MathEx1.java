package com.algorithm.backjoon;

import java.util.Scanner;

public class MathEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[][] arr =  new int[15][15];

        //0 층은 1,2,3,4,5...초기화 , 1호는 모두 1로 초기화
        for(int i=0; i<15;i++){
            arr[i][1] = 1;   //i층 1호
            arr[0][i] = i;      //0층 i호
        }

        for(int i =1; i<15; i++){          //1층부터 14층까지
            for(int j=2; j<15;j++){         //2호부터 14호까지
                arr[i][j] =  arr[i][j-1] +  arr[i-1][j];
            }
        }

        for(int i =0; i<a; i++){
            int k = sc.nextInt();
            int h = sc.nextInt();
            System.out.println(arr[k][h]);
        }
    }
}
