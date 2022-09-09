package com.algorithm.programers;



import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BestNumber {
  public String solution(int[] numbers) {
    String answer = "";
    String[] str = new String[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      str[i] = String.valueOf(numbers[i]);
    }
    
//    Arrays.sort(str, Collections.reverseOrder());
//    System.out.println(str);
  
  
    Arrays.sort(str, (a,b) -> {
      return (b+a).compareTo(a+b);
    });
    for (int i = 0; i < str.length; i++) {
      System.out.println("str[i]" + str[i]);
      answer+= str[i];
    }


    return answer;
  
  
//    Arrays.sort(str, new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return (o2+o1).compareTo(o1+o2);
//      }
//    });
//
//
//
//    if(str[0].equals("0")) return "0";
//
//    //문자열을 delimiter("") 기준으로 합침
//    return String.join("", str);
  }
  
  
  public static void main(String[] args) {
    BestNumber b = new BestNumber();
    //int[] numbers = {6, 10, 2};
    int[] numbers = {3, 30, 34, 5, 9};
    
    System.out.println(b.solution(numbers));
  }
}
