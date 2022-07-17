package com.algorithm.leetcode;

public class NumberOfStepsToReduceANumberToZero {
  
  
  public int ReduceNumber(int num){
    
    int step = 0;
  
    while(num > 0){
      if(num % 2 == 0){
        num /= 2;
        step++;
      }else {
        num -= 1;
        step++;
      }
    }
   
    return step;
  }
  public static void main(String[] args) {
    NumberOfStepsToReduceANumberToZero n = new NumberOfStepsToReduceANumberToZero();
    int num = 8;
    System.out.println(n.ReduceNumber(num));
  }
}
