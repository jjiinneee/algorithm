package com.algorithm.backjoon;

import java.util.Scanner;

public class Back10808 {
  public static void main(String[] args) {
//    String test = "Hello";
//    System.out.println(test.charAt(0));
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();

    int[] alphabet = new int[26];

    for (int i = 0; i < word.length(); i++) {
      alphabet[word.charAt(i) -97]++;
    }

    for (int i = 0; i < alphabet.length; i++) {
      System.out.print(alphabet[i] +" ");
    }
  }
}
