package com.algorithm.hong_t;

import java.util.Arrays;

// https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1440/
public class ReverseString {
  public void reverseString(char[] s) {
    int length = s.length;
//    for (int i = 0, j = length - 1; i < j; i++, j--) {
//      char temp = s[i];
//      s[i] = s[j];
//      s[j] = temp;
//    }
    for (int i = 0; i < length / 2; i++) {
      int j = length - 1 - i;
      char temp = s[i];
      s[i] = s[j];
      s[j] = temp;
    }
  }
  
  public static void main(String[] args) {
    char[] arr = {48, 49, 50, 51, 52, 53, 54, 55};
    ReverseString s = new ReverseString();
    s.reverseString(arr);
    System.out.println(Arrays.toString(arr));
  }
}
