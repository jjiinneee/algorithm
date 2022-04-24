package com.algorithm.backjoon;

import java.util.Scanner;

public class Back10798 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    char[][] a = new char[5][];
    for(int i=0; i<a.length; i++){
      String b = scanner.nextLine();
      a[i] = new char[b.length()];
      for (int j=0; j<b.length(); j++){
        a[i][j] = b.charAt(j);
      }
    }
    
  }
}
