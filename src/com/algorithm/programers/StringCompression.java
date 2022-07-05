package com.algorithm.programers;

public class StringCompression {
  public int solution(String s) {
    //초기화
    int answer = s.length();
  
  
    for (int i = 1; i < s.length()/2 ; i++) {
      String target = s.substring(0,i);
      String cur = "";
      int cnt =1;
      StringBuilder sb = new StringBuilder();
    }
    
    
    return answer;
  }
  
  public static void main(String[] args) {
    StringCompression s = new StringCompression();
    String str = "aabbaccc";
    System.out.println(s.solution(str));
  }
}


//https://hyojun.tistory.com/entry/Programmers-%EB%AC%B8%EC%9E%90%EC%97%B4-%EC%95%95%EC%B6%95-Java