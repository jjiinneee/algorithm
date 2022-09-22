package com.algorithm.hanbit;

import java.util.Arrays;

public class Guild {
  
  public int solution(int[] num){
    int result = 0; //그룹의 수
  
    Arrays.sort(num);
    int count = 0;    //모험가의 수
    for (int i = 0; i < num.length; i++) {
      count++;
      if(count >= num[i]){
        result++;
        count= 0 ;
      }
    }
    return result;
  }
  public static void main(String[] args) {
    Guild g = new Guild();
    int[] num = {2,3,1,2,2};
    System.out.println(g.solution(num));
    
  }
}
