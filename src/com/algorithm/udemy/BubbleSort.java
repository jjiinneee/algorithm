package com.algorithm.udemy;

import java.util.Arrays;

public class BubbleSort {
  
  public int[] solution(int[] numbers) {
    boolean swap = false;
    for (int i = numbers.length; i > 0; i--) {
      swap = true;
      for (int j = 0; j < numbers.length -1; j++) {
        if(numbers[j] > numbers[j+1]){
          int temp = numbers[j];
          numbers[j] = numbers[j+1];
          numbers[j+1] = temp;
          swap = false;
        }
      }
    }
    return numbers;
  }
  
  public static void main(String[] args) {
    BubbleSort b = new BubbleSort();
    int[] numbers = {37,45,29,8};
    int[] answer = b.solution(numbers);
    System.out.println(Arrays.toString(answer));
  }
}
