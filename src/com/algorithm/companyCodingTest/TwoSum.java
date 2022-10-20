package com.algorithm.companyCodingTest;

import java.util.HashMap;

public class TwoSum {
  public static int[] findTwoSum(int[] list, int sum) {
    if(list ==  null || list.length <2){
      return null;
    }
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < list.length-1; i++) {
      int req = sum - list[i];
      if(hashMap.get(req) != null){
        return new int[]{i, hashMap.get(req)};
      }
      hashMap.put(list[i], i);
    }
    return null;
  }
  
  public static void main(String[] args) {
    int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
    if(indices != null) {
      System.out.println(indices[0] + " " + indices[1]);
    }
  }
}
