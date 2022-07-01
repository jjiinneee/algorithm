package com.algorithm.programers;

public class AddMinus {
  
  public int solution(int[] absolutes, boolean[] signs) {
    int answer = 0;
    
    if(absolutes.length != signs.length){
      return -1;
    }
  
    for (int i = 0; i < absolutes.length; i++) {
      if(signs[i] == true){
        answer += absolutes[i];
      }else{
        answer-=absolutes[i];
      }
    }
    return answer;
  }
  
  public static void main(String[] args) {
    AddMinus a = new AddMinus();
//    int[] absolutes = {4,7,12};
//    boolean[] signs = {true,false,true};
    int[] absolutes = {1,2,3};
    boolean[] signs = {false,false,true};
    System.out.println(a.solution(absolutes,signs));
  }
}
