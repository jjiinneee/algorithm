package com.algorithm.grammar.recursive;

public class RecursiveEx {
  
  public static void recursiveFunction(){
    System.out.println("재귀함수 호출합니다.");
    recursiveFunction();
  }
  
  public static void main(String[] args) {
    recursiveFunction();
  }
}
