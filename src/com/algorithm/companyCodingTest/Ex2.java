package com.algorithm.companyCodingTest;

import java.nio.file.Watchable;

public class Ex2 {
  
  public long solution(long n) {
    long answer = 0;
  
    int[] arr = new int[60];
    for (int i = 0; i < 60; i++) {
      if(i %3 == 0){
        arr[i] = i;
        System.out.println(arr[i]);
      }
  
      
    }
    
    return answer;
  }
  
  public static void main(String[] args) {
    Ex2 e = new Ex2();
    long n = 4;
    System.out.println(e.solution(n));
    
  }
}
