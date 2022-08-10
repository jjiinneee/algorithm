package com.algorithm.hanbit;

import java.util.LinkedList;

public class SectionSum {
  
  public int sum(int[] data, int left, int right){
    LinkedList<Integer> linkedList = new LinkedList<>();
    int sum_value = 0;
    
    //int result = 0;
    for (int i = 0; i < data.length; i++) {
      sum_value+=i;
      linkedList.push(sum_value);
    }
    System.out.println(linkedList);
    return linkedList.get(right) - linkedList.get(left - 1);
  }
  
  public static void main(String[] args) {
    SectionSum s = new SectionSum();
    int[] data = {10,20,30,40,50};
    int left = 3;
    int right = 4;
  
    System.out.println( s.sum(data,left, right));
  }
}
