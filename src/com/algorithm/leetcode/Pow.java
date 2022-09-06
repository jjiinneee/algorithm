package com.algorithm.leetcode;

public class Pow {
  
  public double myPow(double x, int n) {
    double result = 1;
    
//    if(n < 0){
//      return Math.Squared(1/x,-n);
//    }else{
//      return Math.Squared(x,n);
//    }

    if(x == 0){
      return 0;
    }
  
    if(n < 0){
      n = -n;
      x = 1/x;
    }
    for (int i = 0; i < n; i++) {
      result *= x;
    }
    
    return result;
  }
  
  public static void main(String[] args) {
    Pow  p = new Pow();
    int n = 2;
    double x = 2;
  
    System.out.println(p.myPow(x,n));
  }
}
