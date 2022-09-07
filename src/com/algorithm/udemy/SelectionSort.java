package com.algorithm.udemy;

import java.util.Arrays;

public class SelectionSort {
  
  public int[] solution(int[] numbers) {
    int temp;
    for (int i = 0; i < numbers.length; i++) {
     int min = i;
      for (int j = i+1; j < numbers.length; j++) {
        if(numbers[min] > numbers[j]){
          min = j;
        }
      }
      
      if(i != min){
        temp = numbers[i];
        numbers[i] = numbers[min];
        numbers[min] = temp;
      }
    }
    
    
    return numbers;
  }
  
  
  public static void main(String[] args) {
    SelectionSort s = new SelectionSort();
    int[] numbers = {34,22,10,19,17};
    int[] numbers2 = {0,2,13,34,22,10,19,17};
    int[] answer = s.solution(numbers);
    int[] answer2 = s.solution(numbers2);
    System.out.println(Arrays.toString(answer));
    System.out.println(Arrays.toString(answer2));
  
  }
  
}
