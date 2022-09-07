package com.algorithm.programers;



import java.util.Arrays;
import java.util.Collections;

public class BestNumber {
  public String solution(int[] numbers) {
    String answer = "";
    String[] str = new String[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      str[i] = String.valueOf(numbers[i]);
    }
    
    Arrays.sort(str, Collections.reverseOrder());
    System.out.println(str);
  
    if(str[0].equals("0")){
      return "0";
    }
    
    for (int i = 0; i < str.length; i++) {
      System.out.println("str[i]" + str[i]);
      answer+= str[i];
    }
    
    
    return answer;
  }
  
  
  public static void main(String[] args) {
    BestNumber b = new BestNumber();
    int[] numbers = {6, 10, 2};
    
    System.out.println(b.solution(numbers));
  }
}
