package com.algorithm.udemy;

import com.algorithm.backjoon.Back1018;

public class BinarySearch {
  
  public int searchMiddle(int[] arr, int num){
  
    int answer = -1;
    
    int start = arr[0];
    int end = arr.length ;
    int mid =  (start + end) / 2;
    
    while(start < end){
      if(arr[mid] < num){
        start = mid+1;
      }else if(arr[mid] >  num){
        end = mid;
      }else if(arr[mid] == num){
        return mid;
      }
      mid = (start + end) /2;
    }
    
    return -1;
  }
  
  public static void main(String[] args) {
    BinarySearch b = new BinarySearch();
    int[] arr= {1,2,3,4,5};
    int num = 3;
    System.out.println(b.searchMiddle(arr, num));
  }
}
