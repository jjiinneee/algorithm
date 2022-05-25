package com.algorithm.su_t;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    outer:
    for (int i = 0; i < nums.length; i++) {
      int first = nums[i];
      for(int j= i+1; j<nums.length; j++){
        if(first + nums[j] == target){
          result[0] = i;
          result[1] = j;
          break outer;
        }
      }
    }
    return result;
  }
  
  public static void main(String[] args) {
    TwoSum t = new TwoSum();
    int[] nums = {2,7,11,15};
    int target = 9;
  
    System.out.println(t.twoSum(nums,target));
  }
}
