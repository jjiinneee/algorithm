package com.algorithm.leetcode;

import java.util.HashSet;

public class ContainsDuplicate {
  public boolean containsDuple(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if(set.contains(nums[i])){
        return true;
      }else{
        set.add(nums[i]);
      }
    }
    return false;
  }
  
  public static void main(String[] args) {
    ContainsDuplicate c  = new ContainsDuplicate();
    int[] nums = {1,2,3,4};
    System.out.println(c.containsDuple(nums));
  }
}
