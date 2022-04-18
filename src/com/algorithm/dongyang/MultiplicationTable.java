package com.algorithm.dongyang;

public class MultiplicationTable {
  
  public static void main(String[] args) {
  
    for (int step = 1; step <=9 ; step++) {
      System.out.println(step);
      for(int num =1; num<=9; num++){
        System.out.println(step * num);
      }
  
      System.out.println("\n");
    }
  }
}
