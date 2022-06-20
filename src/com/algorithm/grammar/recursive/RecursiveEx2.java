package com.algorithm.grammar.recursive;

public class RecursiveEx2 {
  
  public static void recursiveFunction(int i){
    if( i == 100){
      return;
    }
    System.out.println(i +"번째 재귀함수에서 " + (i+1) +"번째 재귀함수 호출");
    recursiveFunction(i+1);
    System.out.println(i + "번째 재귀함수 종료함");
  }
  
  public static void main(String[] args) {
    recursiveFunction(1);
  }
}
