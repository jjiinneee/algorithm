package com.algorithm.companyCodingTest;

import javax.xml.transform.stax.StAXResult;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
  
  public static int n = 2, m = 3;
  public static int[][] graph =   {
          {1,0,-1,0}
          ,{0, 1, 0, -1}
  };
  public static boolean dfs(int x, int y){
    System.out.println(" x:" +  x);
    System.out.println("y : " + y);
    if (x <= -1 || x >=n || y <= -1 || y >= m) {
      return false;
    }
    if (graph[x][y] == 0) {
      graph[x][y] = 1;
      dfs(x + 1, y);
      dfs(x, y + 1);
      return true;
    }
    return false;
  
  }
  
  public static void main(String[] args) {
    int result = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (dfs(i, j)) {
          result += 1;
        }
      }
    }
    System.out.println(result);
  }
  
 
}
