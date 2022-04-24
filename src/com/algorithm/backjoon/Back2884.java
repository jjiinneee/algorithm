package com.algorithm.backjoon;

import java.util.Scanner;

public class Back2884 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    
    //45분보다 작을 경우
    if(b < 45){
      a --;
      b = 60 - 45 + b;
    }else{
      b = b-45;
    }
    
    //시간이 0보다 작을 경우
    if(a <0){
      a = 23;
    }
    System.out.println(a +" "+ b);
  }
}
