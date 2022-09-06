package com.algorithm.udemy;

import java.util.HashMap;

public class ValidAnagram {
  
  public int anagram(String a){
    int count = 1;
    char str1 = 0;
    char str2 = 0;
    
    for (int i = 0; i < a.length() -1; i++) {
      if(str1 == str2){
        count++;
      }else{
        count +=1;
      }
    }
   return count;
  }
  
  
  public boolean anagram2(String a , String b){
    if(a.length() != b.length()){
      return false;
    }
  
    for (int i = 0; i < a.length(); i++) {
      for (int j = 0; j < b.length(); j++) {
      
      }
    }
    return true;
  }
  
  
  public static void main(String[] args) {
    ValidAnagram v = new ValidAnagram();
    String str = "anagram";
    System.out.println(v.anagram(str));
    
    String str2 = "nagaram";
    System.out.println(v.anagram2(str,str2));
    
  }
}
