package com.algorithm.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Back11399 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    
    int[] arr = new int[num];
  
    for (int i = 0; i < num; i++) {
      arr[i] = sc.nextInt();
    }
  
    Arrays.sort(arr);
    
    int prev = 0;
    int sum = 0;
  
    for (int i = 0; i < num; i++) {
      sum+= prev+ arr[i];
      prev+= arr[i];
      
    }
    System.out.println(sum);
  }
}
