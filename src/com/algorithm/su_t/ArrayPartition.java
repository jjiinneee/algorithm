package com.algorithm.su_t;

import java.util.Arrays;

public class ArrayPartition {
  
  public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int sum = 0;
    for (int i = 0; i < nums.length; i = i+2) {
      sum += nums[i];
    }
    
    return sum;
  }
  
  public static void main(String[] args) {
    ArrayPartition s = new ArrayPartition();
    
    int[] nums1 = {1,4,3,2};
    int[] nums2 = {6,2,6,5,1,2};
    
    System.out.println(s.arrayPairSum(nums1)); // 4
    System.out.println(s.arrayPairSum(nums2)); // 9
  }
  
}
