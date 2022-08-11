package com.algorithm.hanbit;

import java.util.LinkedList;

public class SectionSum {
  
  public int sum(int[] data, int left, int right){
    int sum_value = 0;
    
    int[] perfiex_sum = new int[data.length];
    for (int i = 0; i < data.length; i++) {
      sum_value+=i;
      
      perfiex_sum[i] += sum_value;
    }

    
    return perfiex_sum[right] - perfiex_sum[left-1];
  }
  
  public static void main(String[] args) {
    SectionSum s = new SectionSum();
    int[] data = {10,20,30,40,50};
    int left = 3;
    int right = 4;
  
    System.out.println( s.sum(data,left, right));
  }
}
