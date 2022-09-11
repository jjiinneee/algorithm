package com.algorithm.programers;

import java.util.Arrays;

public class PhoneBook {
  
  public boolean solution(String[] phone_book) {
    boolean answer = true;
    Arrays.sort(phone_book);
  
    for (int i = 0; i < phone_book.length -1; i++) {
      if(phone_book[i +1].startsWith(phone_book[i])){
        return false;
      }
    }
    return answer;
  }
  
  public static void main(String[] args) {
    PhoneBook p = new PhoneBook();
   // String[] phone_book = {"119", "97674223", "1195524421"};
    String[] phone_book = {"123","456","789"};
//    String[] phone_book = {"12","123","1235","567","88"};
    System.out.println(p.solution(phone_book));
  }
}
