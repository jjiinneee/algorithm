package com.algorithm.programers;

import java.util.Arrays;

public class Carpet {
  public int[] solution(int brown, int yellow) {
    int[] answer = new int[2];
   
    int area = brown + yellow;
  
    for (int i = 3; i <= area ; i++) {
      int col = i;   //세로
      int row =  area/col;     //가로
      System.out.println("row" +  row);
      
      if(row < 3){
        continue;
      }
      //카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
      if(row >= col){
        if((row -2) * (col-2) == yellow){
          answer[0] = row;
          answer[1] = col;
          return answer;
        }
      }
    }
    return answer;
  }
  
  public static void main(String[] args) {
    Carpet c = new Carpet();
    int brown = 10;
    int yellow = 2;
    System.out.println(Arrays.toString(c.solution(brown,yellow)));
  }
}
