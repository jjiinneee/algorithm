package com.algorithm.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Back11651 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //점의 갯수
        int dotNum = scanner.nextInt();
        //x,y받을 값
        int[][] tt = new int[dotNum][2];
        for (int i = 0; i < dotNum; i++) {
            String[] x_y = scanner.nextLine().split(" ");
            tt[i][0] = Integer.parseInt(x_y[0]);
            tt[i][1] = Integer.parseInt(x_y[1]);
        }

        Arrays.sort(tt, (x,y) ->{
            if(x[0] == y[0]){
                return x[1] - y[1];
            }else{
                return x[0] - y[0];
            }
        });

        for(int i=0; i<dotNum; i++){
            System.out.println(tt[i][1] + " " + tt[i][0]);
        }
        
    }
}
