package com.algorithm.hong_t;

public class SearchInsertPosition {
  
  public int searchInsert(int[] nums, int target) {
    int start = 0;
    int end = nums.length;
    int mid = (start + end) / 2;  //index
    
   while(start <  end){
     if(nums[mid] < target){
        start = mid+1;
     }
     else if(nums[mid] > target){
       end = mid;  //2
     }else{
       break;
     }
     mid = (start + end) / 2;
   }
   
//    for (int i = 0; i < nums.length; i++) {
//      if(nums[i] ==  target){
//        result = i;
//      }
//    }
    
    return mid;
  }
  
  public static void main(String[] args) {
    SearchInsertPosition s = new SearchInsertPosition();
    
    int[] nums = {1,3,5,6};
    int target = 5;
    
    System.out.println(s.searchInsert(nums,target)); // 1
  }
}
