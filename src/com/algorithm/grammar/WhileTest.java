package com.algorithm.grammar;

import java.util.Scanner;

public class WhileTest {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String tmp = sc.nextLine();
    int num = Integer.parseInt(tmp);
    int sum = 0;
    while(num !=0){
      sum += num%10;
      
      num = num/10;
     
    }
    System.out.println(sum);
  }
}
