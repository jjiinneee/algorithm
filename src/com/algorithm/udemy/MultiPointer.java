package com.algorithm.udemy;

public class MultiPointer {
  
  public int twoPinter(int[] nums){
    int left = 0;
    
    if(nums.length == 0){
      return 0;
    }
    for (int i = 1; i < nums.length; i++) {
      if(nums[left] != nums[i]){
        left++;
        nums[left] =nums[i];
      }
    }
    return left+1;
  }
  
  public static void main(String[] args) {
    MultiPointer m = new MultiPointer();
    //정렬되어있는 배열이여야지 사용가능!!
    int [] nums = {1,2,3,4,4,4,7,7,12,13};
    System.out.println(m.twoPinter(nums));
  }
  
}
