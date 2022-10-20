package com.algorithm.companyCodingTest;

import com.algorithm.udemy.StackInterface;

import java.util.*;

public class Ex10 {
  public int solution(String[] color, int[] prices){
    int answer = 0;
    
    ArrayList<String> tops = new ArrayList<String>();
    ArrayList<String> bottoms = new ArrayList<String>();
 
    for (int i = 0; i < color.length; i++) {
      tops.add(color[i].split("")[0]);
      bottoms.add(color[i].split("")[1]);
    }
    
    int sameCnt =0;
    int notCnt= 0;
    for(String top : tops){
      boolean isEquals = false;
      for(String bottom : bottoms){
        if(top.equals(bottom)){
          isEquals = true;
        }
      }
      if(isEquals){
        sameCnt++;
      }else{
        notCnt++;
      }
    }

 
   answer = prices[0] * sameCnt + prices[1] * notCnt;

   
    return answer;
  }
  
  public static void main(String[] args) {
    Ex10 e = new Ex10();
    String[] color = {"RG", "WR", "BW", "GG"};
    int[] prices = {5000,6000};
//    String[] color = {"YW", "RY", "WG", "BW"};
//    int[] prices = {7561,8945};
  
//    String[] color = {"BW", "RY", "BY"};
//    int[] prices = {9000,10000};
//    String[] color = {"RG", "WR", "BW", "GG"};
//    int[] prices = {2000,6000};
    System.out.println(e.solution(color,prices));
  }
}
