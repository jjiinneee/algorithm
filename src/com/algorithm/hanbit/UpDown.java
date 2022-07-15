package com.algorithm.hanbit;

import java.util.Arrays;
import java.util.Collections;

public class UpDown {
  public void sortEx(Integer[] arr){
  //내림차순 정렬 수행
    Arrays.sort(arr, Collections.reverseOrder());
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
    
    
  }
  
  public static void main(String[] args) {
      UpDown u = new UpDown();
      Integer[] arr = {3, 15,27,12};
      u.sortEx(arr);
  }
}
