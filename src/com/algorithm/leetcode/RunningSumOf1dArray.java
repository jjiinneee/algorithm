package com.algorithm.leetcode;

import java.util.Arrays;

public class RunningSumOf1dArray {
  
  //problem i solved
  public int[] runningSum(int[] nums) {
    int[] answer = new int[nums.length];
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      result += nums[i];
      answer[i] = result;
    }

    return answer;
  }
  
  //best
//  public int[] runningSum(int[] nums) {
//    for (int i = 1; i < nums.length; i++) {
//      nums[i] += nums[i-1];
//    }
//
//    return nums;
//  }
  public static void main(String[] args) {
    RunningSumOf1dArray r = new RunningSumOf1dArray();
   // int[] nums = {1,2,3,4};
    int[] nums = {1,1,1,1,1};
    System.out.println(Arrays.toString(r.runningSum(nums)));
  }
}
