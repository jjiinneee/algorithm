package com.algorithm.udemy;

public class FrequencyCounter {
  
  public boolean validAnagram(String str1, String str2){
    
    if(str1.length() != str2.length()){
      return false;
    }
    
    for (int i = 0; i < str1.length(); i++) {
      if(str1.charAt(i) == str2.charAt(i)){
        return true;
      }else{
        return false;
      }
    }
    
    
    
    
    return true;
  }
  
  public static void main(String[] args) {
    FrequencyCounter f = new FrequencyCounter();
//    String str1 = "qwerty";
//    String str2 ="qeywrt";
    String str1 = "aaz";
    String str2 ="zza";
    System.out.println(f.validAnagram(str1,str2));
  }
}
