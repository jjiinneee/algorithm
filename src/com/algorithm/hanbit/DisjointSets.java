package com.algorithm.hanbit;

public class DisjointSets {
  public static int v,e;     //노드의 개수(v), 간선 게수(e)
  public static int[] parent = new int[100001];   //부모테이블 초기화
  
  //특정 원소가 속한 집합을 찾기
  public static int findParent(int x){
    if(x == parent[x]){
      return x;
    }
    return findParent(parent[x]);
  }
  
  //
}
