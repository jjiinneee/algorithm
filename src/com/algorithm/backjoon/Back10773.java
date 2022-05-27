package com.algorithm.backjoon;

import java.util.Scanner;
import java.util.Stack;

public class Back10773 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
  
    Stack<Integer> stack = new Stack<>();
  
    for(int i = 0; i < num; i++) {
      int number = sc.nextInt();
    
      if(number == 0) {	// 0이라면 스택에 저장된 top 원소를 지운다.
        stack.pop();
      }
      else {
        stack.push(number);
      }
    }
    int sum = 0;
  
    for(int o : stack) {
      sum += o;
    }
  
    System.out.println(sum);
  }
}
