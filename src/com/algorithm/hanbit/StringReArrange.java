package com.algorithm.hanbit;

import java.util.ArrayList;
import java.util.Collections;

public class StringReArrange {
  
  public String ReArragement(String str){
  
    ArrayList<Character> list = new ArrayList<>();
    int value = 0;
    for (int i = 0; i < str.length(); i++) {
     if(Character.isLetter(str.charAt(i))){
       list.add(str.charAt(i));
     }else{
       value += str.charAt(i) - '0';
     }
    }
    Collections.sort(list);
    
    if(value !=0){
      System.out.println(value);
    }
    return String.valueOf(list);
  }
  
  public static void main(String[] args) {
    StringReArrange s = new StringReArrange();
    String str = "K1KA5CB7";
    System.out.println(s.ReArragement(str));
  }
}
