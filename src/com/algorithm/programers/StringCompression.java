package com.algorithm.programers;

public class StringCompression {
  public int solution(String s) {
    //초기화
    int answer = s.length();
  
    // 조건이 1~1000 까지임 그럼 반절나눠서 해도된다!!라는 전제가 주어짐
    for (int i = 0; i < s.length() / 2 +1; i++) {
      String compressed = "";
      String prev = s.substring(0,i);   //앞에서 부터 i만큼 문자열 추출
      int cnt = 1;
  
      //i 단위만큼 증가시키며 이전 문자열과 비교
      for (int j = i; j < s.length() ; j += i) {
          //이전상태와 동이랗면 cnt 증가
        String sub = "";
        for (int k = j; k < j+i; k++) {
          if(k<s.length()){
            sub+=s.charAt(k);
          }
        }
        if(prev.equals(sub)){
          cnt +=1;
        }else{
          compressed += (cnt >= 2) ? cnt + prev : prev;
          sub = "";
          for (int k = j; k < j+i; k++) {
            if(k<s.length()){
              sub+=s.charAt(k);
            }
          }
          prev = sub;
          cnt = 1;
        }
      }
      compressed += (cnt >= 2)? cnt +prev : prev;
      answer = Math.min(answer, compressed.length());
    }
    return answer;
  }
  
  public static void main(String[] args) {
    StringCompression s = new StringCompression();
    String str = "xababcdcdababcdcd";
    System.out.println(s.solution(str));
  }
}


//https://hyojun.tistory.com/entry/Programmers-%EB%AC%B8%EC%9E%90%EC%97%B4-%EC%95%95%EC%B6%95-Java