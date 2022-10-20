package com.algorithm.companyCodingTest;

import java.util.Arrays;

public class Ex9 {
  public int solution(int[] scores, int k){
    int answer = 0;
    int length =  scores.length-1;
    int max = scores[0];
    int min = scores[0];
  
  
   
  
    
      int[] one = new int[length - k];
      int[] two = new int[length - one.length];
      int[] third = new int[scores.length - (one.length + two.length)];
    
  
    for (int i = 0; i < one.length; i++) {
      one[i] = scores[i];
      if(max < one[i]){
        max = one[i];
       // System.out.println("max" + max);
      }
      if(min >= one[i]){
        min = one[i];
     //   System.out.println(min);
      }
      answer = max - min;
    }
   // System.out.println("1"+ answer);
    
    
    for (int i = 0; i < two.length ; i++) {
      max = scores[0+two.length];
      System.out.println("max"+ max);
      two[i] = scores[one.length+ i];
//      if(max < two[i]){
//        max = two[i];
//        System.out.println("max_twp" + max);
//      }
//      if(min > two[i]){
//        min = two[i];
//        System.out.println(min);
//      }
//      answer = max - min;
//      System.out.println("2" + answer);
    }
    
    
    for (int i = 0; i < third.length; i++) {
      third[i] = scores[one.length+two.length+ i];
    }
    
     
//      System.out.println(Arrays.toString(one));
//      System.out.println(Arrays.toString(two));
//      System.out.println(Arrays.toString(third));
//
      
   // }
    return answer;
  }
  
  public static void main(String[] args) {
    Ex9 e = new Ex9();
    int[] scores = {1,3,7,8,10,15};
    int k = 3;  //5
  
    int[] scores2 = {1,2,12,14,15};
    int k2 = 2;
    System.out.println(e.solution(scores,k));
    System.out.println(e.solution(scores2,k2));
  }
}
