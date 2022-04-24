package com.algorithm.backjoon;

import java.util.Scanner;

public class Back2490 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//    첫째 줄부터 셋째 줄까지 각 줄에 각각 한 번 던진 윷짝들의 상태를 나타내는 네 개의 정수(0 또는 1)가 빈칸을 사이에 두고 주어진다
//    0=배 / 1=등

//    0 1 0 1
//    1 1 1 0
//    0 0 1 1
   
    int[] arr = new int[4];
    int[] numbers =  new int[3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < arr.length; j++) {
          arr[i] =  scanner.nextInt();
          
          if(arr[i] == 0){
//            number ++;
            numbers[i]++;
          }
      }
    }
  
    for (int number: numbers) {
      if(number== 4){
        System.out.println("D");
      }else if(number == 3){
        System.out.println("C");
      }else if(number == 2){
        System.out.println("B");
      }else if(number ==1){
        System.out.println("A");
      }else{
        System.out.println("E");
      }
    }
    
  }
}
