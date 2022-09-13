package com.algorithm.companyCodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex7 {
  
  public static ArrayList<String> arr = new ArrayList<>();
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    
    String[] test = new String[n];
    System.out.println(Arrays.toString(test));
    for (int i = 0; i < n ; i++) {
      String k = sc.nextLine();
//      Arrays.fill(test, k);
      test[i] = k;
      System.out.println(test[i]);
      
    }
  
  
   // System.out.println(Arrays.toString(test));
    for (int i = 1; i < test.length -1; i++) {
      for (int j = 0; j < test[i].length(); j++) {
        if(test[i].equals(test[j])){
          count++;
        }
      }
    }
    System.out.println(count);
   // for (int i = 0; i < n; i++) {
    // test = Integer.parseInt(sc.nextLine());
    //}
  
//    Collections.sort(arr);
//    System.out.println(arr.toString());
//
//    for (int i = 0; i < arr.size(); i++) {
//      if(arr.get(i + 1) != arr.get(i)){
//        count++;
//      }
//    }
//
//    System.out.println(count);
  }
}
