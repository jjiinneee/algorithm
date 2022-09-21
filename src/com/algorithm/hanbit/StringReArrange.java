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
  
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    
    if(value !=0){
      System.out.println(value);
    }
    
    return "";
  //  return String.valueOf(list);
  }
  
  public static void main(String[] args) {
    StringReArrange s = new StringReArrange();
    String str = "AJKDLSI412K4JSJ9D";
    System.out.println(s.ReArragement(str));
  }
}
