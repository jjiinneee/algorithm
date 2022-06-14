package com.algorithm.hong_t;

public class BinarySearch {
//  public int search(int[] nums, int target) {
//    for (int i = 0; i < nums.length; i++) {
//      if(nums[i] == target) {
//        return i;
//      }
//    }
//    return -1;
//  }
  
  
  //이진탐색.. 가운데먼저 찾고
  //target이랑 같으면 인덱스값 출력
  //아니면 계속 돌아
  //nums.length >>  배열의 개수
  //nums[nums.length -1]  >> 배열의 마지막 요소
  public int search(int[] nums, int target) {
  
    int start  = 0;
    int end = nums.length;
    int mid = (start + end) / 2;
  
    while(start < end){
      if(nums[mid]< target){
        start = mid + 1;
      }
      else if(nums[mid] > target){
        end = mid;
      }else{
        return mid;
      }
      mid = (start + end) / 2;
    }
    

    return -1;
  }
  
  public static void main(String[] args) {
     int[] nums = {-1,0,3,5,9,12};
     int target = 9;
  //  int target = 2;
  //  System.out.println(nums[nums.length/2]);
    BinarySearch s = new BinarySearch();
    s.search(nums, target);
    System.out.println(s.search(nums,target));
  }
}
