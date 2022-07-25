package com.algorithm.companyCodingTest;

import java.util.Arrays;
import java.util.Collections;



public class Ex1 {
  
  public int solution(int n) {
    int answer = -1;
    String temp = Integer.toString(n);
    Integer[] arr = new Integer[temp.length()];
    for (int i = 0; i < temp.length(); i++) {
      arr[i] = temp.charAt(i) - '0';
    }
    
    answer =  Integer.parseInt(sort(arr)) + Integer.parseInt(reverse(arr));
    
    return answer;
  }
  
  
  public String sort(Integer[] arr){
    Arrays.sort(arr);
    
    String sum = "";
    for (int i = 0; i < arr.length; i++) {
      sum += String.valueOf(arr[i]);
    }
    return sum;
  }
  
  public String reverse(Integer[] arr){
    Arrays.sort(arr,Collections.reverseOrder());
  
    String sum = "";
    for (int i = 0; i < arr.length; i++) {
      sum += String.valueOf(arr[i]);
    }
    return sum;
  }
  public static void main(String[] args) {
    Ex1 e = new Ex1();
    int n = 2613;
    int n2 = 33285;

  
    System.out.println(e.solution(n));
    System.out.println(e.solution(n2));
  }
}
