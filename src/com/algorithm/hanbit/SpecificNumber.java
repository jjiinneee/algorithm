package com.algorithm.hanbit;

import java.util.Scanner;

public class SpecificNumber {

  public static int lowerBound(int[] arr, int target, int start, int end){
    while (start < end ){
      int mid = (start + end) /2 ;
      if(arr[mid] >= target){
        end = mid;
      }else{
        start = mid +1;
      }
    }
    return end;
  }
  
  public static int upperBound(int[] arr, int target, int start, int end){
    while(start < end ){
      int mid = (start + end ) /2;
      if(arr[mid] > target){
        end = mid;
      }else{
        start = mid +1;
      }
    }
    return end;
  }
  
  
  public  int countByRange(int[] arr, int leftValue, int rightValue){
    int rightIndex = upperBound(arr, rightValue, 0, arr.length);
    int leftIndex = lowerBound(arr, leftValue, 0, arr.length);
    
    int result = rightIndex - leftIndex;
    if(result == 0){
       result = -1;
    }
    return result;
  }
  
  
  public static void main(String[] args) {
    SpecificNumber sp = new SpecificNumber();
    int arr[] = {1,1,2,2,2,2,3};
    int target = 4;
    System.out.println(sp.countByRange(arr, target, target));
  }
}
