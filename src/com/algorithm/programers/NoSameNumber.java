package com.algorithm.programers;

import java.util.ArrayList;
import java.util.Arrays;

public class NoSameNumber {
  
  public int[] solution(int[] arr){
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    int num = -1;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] != num){
        list.add(arr[i]);
        num = arr[i];
      }
    }
    
   int[] answer = new int[list.size()];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = list.get(i);
    }
   return answer;
  }
  
  public static void main(String[] args) {
    NoSameNumber n  = new NoSameNumber();
    int[] arr = {1,1,3,3,0,1,1};
    int[] result = n.solution(arr);
    System.out.println(Arrays.toString(result));
  }
}

