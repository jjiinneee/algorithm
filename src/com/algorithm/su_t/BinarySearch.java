package com.algorithm.su_t;

public class BinarySearch {
  public int search(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if(nums[i] == target) {
        return i;
      }
    }
    return -1;
  }
  
  public static void main(String[] args) {
     int[] nums = {-1,0,3,5,9,12};
//     int target = 9;
    int target = 2;
  
    BinarySearch s = new BinarySearch();
    s.search(nums, target);
    System.out.println(s.search(nums,target));
  }
}
