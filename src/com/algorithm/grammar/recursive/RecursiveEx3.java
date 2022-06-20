package com.algorithm.grammar.recursive;

public class RecursiveEx3 {
  //반복
  public static int factorialIterative(int n){
    int result = 1;
    
    for (int i =1; i<=n; i++){
      result *= i;
    }
    return result;
  }
  
  //재귀
  public static int factorialRecursive(int n){
    //n이 1이하인 경우 1을 반환
    if(n <= 1){
      return 1;
    }
    
    return n* factorialRecursive(n-1);
  }
  
  public static void main(String[] args) {
    System.out.println("반복적으로 구현" +factorialIterative(5));
    System.out.println("재귀적으로 구현" + factorialRecursive(5));
  }
}
