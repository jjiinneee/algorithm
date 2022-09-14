package com.algorithm.hanbit;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChangeArray {
  
  // 5  3
  // 1 2 5 4 3
  //5 5 6 6 5
  //연산1 a의 원소 1과 b의 원소 6바꾸기
  //연산2 a의 원소 2과 b의 원소 6바꾸기
  //연산3 a의 원소 3과 b의 원소 5바꾸기
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
  
    Integer[] a = new Integer[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    
    Integer[] b = new Integer[n];
    for (int i = 0; i < n; i++) {
      b[i]  = sc.nextInt();
    }
  
    Arrays.sort(a);
    Arrays.sort(b, Collections.reverseOrder());
  
    for (int i = 0; i < k; i++) {
      if(a[i] <b[i]){
        int temp = a[i];
        a[i] = b[i];
        b[i] = temp;
      }else{
        break;
      }
    }
    
    int result = 0;
    for (int i = 0; i < n; i++) {
      result+=a[i];
    }
    System.out.println(result);
  }
}
