package com.algorithm.leetcode;

public class PalindromeNumber {
  
//  public boolean isPalindrome(int x) {
//
//    if(x < 0) {
//      return false;
//    }
//
//    return x == reverseInt(x);
//  }
  
  public boolean isPalindrome(int x) {
    if (x < 0) return false;
    
    String num = String.valueOf(x);
    StringBuilder builder = new StringBuilder(num);
    String reverse = builder.reverse().toString();
    return num.equals(reverse);
    
  }
  
  private int reverseInt(int num) {
    
    int result = 0;
    
    while(num > 0){
      result = num % 10 + result *10;
      num = num /10;
    }
    return result;
  }
  
  public static void main(String[] args) {
    PalindromeNumber s = new PalindromeNumber();
  
    System.out.println(s.isPalindrome(123)); // f
    System.out.println(s.isPalindrome(121)); // t
    System.out.println(s.isPalindrome(1223221)); // t
    System.out.println(s.isPalindrome(-15651)); // f
    System.out.println(s.isPalindrome(0)); // t
    
    
  }
}
