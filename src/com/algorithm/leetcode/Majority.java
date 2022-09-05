package com.algorithm.leetcode;

import java.util.Arrays;


public class Majority {
  public int majorityElement(int[] nums) {
    int maxCount = 0;
    int count = 0;
    int element = 0;
  
    Arrays.sort(nums);
  
    if(nums.length == 1){
      return nums[0];
    }
  
    for(int i = 0 ; i < nums.length-1 ; i++){
      if (nums[i] == nums[i+1]){
        count++;
        if(count >= nums.length/2){
          return nums[i];
        }
      }else{
        if (maxCount < count){
          maxCount = count;
          count = 1;
          element = nums[i];
        }
      }
    }
  
    return element;
  }
  
  
  public static void main(String[] args) {
    Majority  m = new Majority();
//    int[] nums = {3,2,3};
    int[] nums = {2,2,1,1,1,2,2};
    System.out.println(m.majorityElement(nums));
  }
}
