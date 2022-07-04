package com.algorithm.programers;

public class CodingTest2 {
  public int[][] solution(int n, boolean horizontal) {

    int[][] answer= new int[n][n];
  

    for (int i = 0; i < answer.length ; i++) {
        for (int j = 0; j < answer[i].length; j++) {
          System.out.println("i" + answer[i][j++]);
//          if(horizontal == true){
//            answer[n][n] = answer[i][j];
//          }
        }
    }
    
    
    return answer;
  }
  
  public static void main(String[] args) {
    CodingTest2 c = new CodingTest2();
    int n = 4;          //5
    boolean horizontal = true;   //false;
    System.out.println(c.solution(n,horizontal));
  }
}
