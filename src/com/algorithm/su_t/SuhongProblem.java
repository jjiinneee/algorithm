package com.algorithm.su_t;

public class SuhongProblem {
//  12345
//  23451
//  34512 .......
  
  public static void main(String[] args) {
    int[] test = {1, 2, 3, 4, 5};
  
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(test[(i + j) % 5]);
      }
      System.out.println();
    }
  }
}
