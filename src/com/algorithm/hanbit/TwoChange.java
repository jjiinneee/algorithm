package com.algorithm.hanbit;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TwoChange {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int n = s.nextInt();
    //int n = 5;
    int k  = s.nextInt();
//    int k = 3;
    
    
    Integer[] a = new Integer[n];
    for (int i = 0; i < n; i++) {
      a[i] = s.nextInt();
    }
  
    Integer[] b = new Integer[n];
    for (int i = 0; i < n; i++) {
      b[i] = s.nextInt();
    }
    
//    int[] a = {1,2,5,4,3};
//    int[] b = {5,5,6,6,5};
  
    Arrays.sort(a);
    Arrays.sort(b, Collections.reverseOrder());
  
    for (int i = 0; i < k; i++) {
      if(a[i] <b[i]){
        int temp = a[i];
        a[i] = b[i];
        b[i] = temp;
      }
      else{
        break;
      }
    }
    
    int result = 0;
    for (int i = 0; i < n; i++) {
      result += a[i];
    }
  
    System.out.println(result);
  
  
  
  }
}
