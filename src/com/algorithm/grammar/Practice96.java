package com.algorithm.grammar;

public class Practice96 {
  public int factorial(int n){
    
    if(n ==0){
      return 1;
    }else{
      return n * factorial(n-1);
    }
    
  }
  public static void main(String[] args) {
    Practice96 s = new Practice96();
    int n = 5;
    System.out.println(s.factorial(n));
  }
}
