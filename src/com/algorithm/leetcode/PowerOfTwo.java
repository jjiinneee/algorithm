package com.algorithm.leetcode;

public class PowerOfTwo {
  
  public boolean isPowerOfTwo(int n) {
    if(n <= 0){
      return false;
    }
    
    while(n>1){
      if(n%2 == 1){
        return false;
      }
      n = n/2;
    }
    return true;
  }
  
  public static void main(String[] args) {
    PowerOfTwo p = new PowerOfTwo();
    int n = 3;
    System.out.println(n);
    System.out.println(p.isPowerOfTwo(n));
  }
}
