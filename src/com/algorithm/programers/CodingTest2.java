package com.algorithm.programers;

public class CodingTest2 {
  public int[][] solution(int n, boolean horizontal) {

    int[][] answer= new int[n][n];
  
    int start = 1;
    for (int i = 0; i < answer.length ; i++) {
        for (int j = 0; j < answer[i].length; j++) {
          
          answer[i][j] = start;
          if(horizontal ==true){
          
          }
          System.out.print( answer[i][j]);
         
//          if(horizontal == true){
//            answer[n][n] = answer[i][j];
//          }
        }
      System.out.println();
    }
    
    
    return answer;
  }
  
  
  // true
  // 1   2   9   10
//   4   3   8   11
//   5   6   7   12
//   16  15  14  13

  //false
  //  1   4   5    16  17
  //  2   3   6    15  18
  //  9   8   7    14  19
  //  10  11  12   13  20
  //  25  24  23   22  21
  
  public static void main(String[] args) {
    CodingTest2 c = new CodingTest2();
    int n = 4;          //5
    boolean horizontal = true;   //false;
    System.out.println(c.solution(n,horizontal));
  }
}
