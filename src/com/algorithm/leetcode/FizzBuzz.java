package com.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
  public List<String> fizzBuzz(int n) {
    List<String>  arr = new ArrayList<String>();
  
    for (int i = 1; i <= n; i++) {
      if(i % 3 == 0 && i % 5 == 0){
        arr.add("FizzBuzz");
      }else if(i % 3 == 0){
        arr.add("Fizz");
      }else if(i % 5 == 0){
        arr.add("Buzz");
      }else{
        arr.add(Integer.toString(i));
      }
    }
  
    return arr;
  }
  
  public static void main(String[] args) {
      FizzBuzz f = new FizzBuzz();
      int n = 15;
    System.out.println(f.fizzBuzz(n));
  }
}
