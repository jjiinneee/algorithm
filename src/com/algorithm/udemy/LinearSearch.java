package com.algorithm.udemy;

public class LinearSearch {
  public int searchIndex(int[] arr , int num){
  
    int answer =-1;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == num){
        answer = i;
      }
    }
    return answer;
  }
  
  public static void main(String[] args) {
    LinearSearch l = new LinearSearch();
    //int[] arr = {10,15,20,25,30};
//    int[] arr = {9,8,7,6,5,4,3,2,1,0};
  //  int[] arr = {100};
    int[] arr = {1,2,3,4,5};
    int num = 6;
    System.out.println(l.searchIndex(arr, num));
  }
}
