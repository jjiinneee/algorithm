package com.algorithm.udemy;

public class Factorial {
  
//  public int factNum(int num){
//    int total = 1;
//    for (int i = num; i > 0 ; i--) {
//      total *= i;
//    }
//
//    return total;
//  }
  
  public int factNum(int num){
    if(num == 1){
      return 1;
    }
    return num * factNum(num -1);
  }
  
  
  public static void main(String[] args) {
    Factorial f = new Factorial();
    f.factNum(3);
    System.out.println(f.factNum(5));
  }
}
