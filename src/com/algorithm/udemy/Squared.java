package com.algorithm.udemy;

import java.util.Arrays;

public class Squared {
  
  public boolean same(int[] arr, int[] arr2){
    if(arr.length < 0 && arr2.length < 0){
      return false;
    }
    
    Arrays.sort(arr2);
    for (int i = 0; i < arr.length; i++) {
      if(arr2[i] ==  arr[i] *2){
        return true;
      }else{
        return false;
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    Squared s = new Squared();
    int[] arr = {1,2,3};
    int[] arr2 = {4,1,9};
    System.out.println(s.same(arr, arr2));
  }
}
