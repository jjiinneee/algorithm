package com.algorithm.grammar;

public class Practice95 {
  
  public int totalSum(int[] number){
    int total = 0;
  
    for (int i = 0; i <number.length; i++) {
     total+=number[i];
    }
    
    return total;
  }
  
  
  
  
  public static void main(String[] args) {
    Practice95 s = new Practice95();
    int[] number = {1,2,3,4};
    System.out.println(s.totalSum(number));
  }
}
