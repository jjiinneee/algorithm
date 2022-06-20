package com.algorithm.grammar;

public class DFSEx {
  public static final int INF = 999999999;
  
  //2차원 리스트를 이용해 인첩 행렬 표현
  public static int[][] grap = {
          {0,7,5},
          {7,0,INF},
          {5,INF,0}
  };
  
  public static void main(String[] args) {
    //그래프 출력
    for (int i = 0; i < grap.length; i++) {
      for (int j = 0; j < grap.length; j++) {
        System.out.println(grap[i][j] +" ");
        
      }
      System.out.println();
    }
  }
}
