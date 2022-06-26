package com.algorithm.programers;

import com.sun.security.jgss.GSSUtil;

public class NumberAndWord {
  
  public int solution(String s) {
    int answer = 0;
//                      0     1     2     3     4       5       6     7       8       9
    String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
  
    for (int i = 0; i < word.length; i++) {
      System.out.println("s : " + s);
      System.out.println("word : " + word[i]);
      s = s.replace(word[i],String.valueOf(i));
    }
    answer = Integer.parseInt(s);
    return answer;
  }
  public static void main(String[] args) {
    
    NumberAndWord n = new NumberAndWord();
    String s = "one4seveneight";
    System.out.println(n.solution(s));
  
  }
}
