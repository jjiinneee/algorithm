package com.algorithm.udemy;

public class MaxSubArraySum {
  public int maxSum(int[] nums , int k){
    int maxSum = 0;
    int tempSum = 0;
    
    if(nums.length < k){
      return 0;
    }
    
    for (int i=0; i<k; i++){
      maxSum += nums[i];
    }
    
    tempSum = maxSum;
    
    for (int i = k; i < nums.length; i++) {
      tempSum = tempSum - nums[i -k] + nums[i];
      maxSum = Math.max(maxSum,tempSum);
    }
    
    return maxSum;
  }
  
  public static void main(String[] args) {
    MaxSubArraySum m = new MaxSubArraySum();
    int[] nums = {2,6,9,2,1,8,5,6,3};
    int k = 3;
    System.out.println(m.maxSum(nums, k));
  }
}
