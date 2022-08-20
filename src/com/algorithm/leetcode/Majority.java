package com.algorithm.leetcode;

import java.util.HashMap;

public class Majority {
  public int majorityElement(int[] nums) {
    int result = 1;
    for (int i = 0; i < nums.length; i++) {
      if(nums[i] == nums[0]){
        result++;
      }else{
        result--;
      }
      if(nums[0] == 0){
        nums[0] = nums[i+1];
        result = 1;
        i++;
      }
    }
    return nums[0];
  }
  
  
  public static void main(String[] args) {
    Majority  m = new Majority();
//    int[] nums = {3,2,3};
    int[] nums = {2,2,1,1,1,2,2};
    System.out.println(m.majorityElement(nums));
  }
}
