package com.algorithm.leetcode;

import java.util.Arrays;

public class SingleNumber {
  
  public int singleNum(int[] nums){
    Arrays.sort(nums);
    int answer = 0;
    for (int i = 0; i < nums.length-1; i+=2) {
      if(nums[i] != nums[i+1]){
        answer = nums[i];
      }else{
        answer = nums[nums.length-1];
      }
      
    }
    return answer;
  }
  
  public static void main(String[] args) {
    SingleNumber s = new SingleNumber();
//    int[] nums = {4,1,2,1,2};
    int[] nums = {2,2,1};
    System.out.println(s.singleNum(nums));
  }
}
