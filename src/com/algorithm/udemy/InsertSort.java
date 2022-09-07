package com.algorithm.udemy;

import java.util.Arrays;

public class InsertSort {
  
  public int[] solution(int[] arr) {
  
    int j;
    for (int i = 1; i < arr.length; i++) {
      int currentVal = arr[i];
      for (j = i-1; j >=0 && arr[j] > currentVal ; j--) {
        arr[j+1] = arr[j];
       
      }
      arr[j+1] = currentVal;
    }
    return arr;
  }
  
  
  public static void main(String[] args) {
    InsertSort i = new InsertSort();
    int[] numbers = {4, 20, 12, 10, 7, 9};
    int[] answer = i.solution(numbers);
    System.out.println(Arrays.toString(answer));
  }
}
