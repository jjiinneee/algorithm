package com.algorithm.grammar;

import java.util.ArrayList;

public class DFSEx3 {
  
  public static boolean[] vistied = new boolean[9];
  public static ArrayList<ArrayList<Integer>>  graph = new ArrayList<ArrayList<Integer>>();
  //스택,재귀함수
  public static void dfs(int x){
    vistied[x] = true;
    System.out.println(x + " ");
    for (int i = 0; i < graph.get(x).size(); i++) {
      int y = graph.get(x).get(i);
      if(!vistied[y]){
        dfs(y);
      }
    }
  }
  public static void main(String[] args) {
    for (int i = 0; i < 9; i++) {
      graph.add(new ArrayList<Integer>());
    }
    
    
  }
}
