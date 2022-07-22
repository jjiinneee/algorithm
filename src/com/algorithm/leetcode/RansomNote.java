package com.algorithm.leetcode;

public class RansomNote {
  
  public boolean canConstruct(String ransomNote, String magazine) {
  
    if(ransomNote.length() >  magazine.length()){
      return false;
    }
  
    int[] ran = new int[26];
    int[] msg = new int[26];
  
   for(char i : ransomNote.toCharArray()){
     ran[i - 'a']++;
   }
  
    for(char i : magazine.toCharArray()){
      msg[i - 'a']++;
    }
  
    for (int i = 0; i < 26; i++) {
      if(ran[i] > msg[i]){
        return false;
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    RansomNote r = new RansomNote();
    String ransomNote = "aab";
    String magazine = "baa";
    System.out.println(r.canConstruct(ransomNote,magazine));
  }
}
