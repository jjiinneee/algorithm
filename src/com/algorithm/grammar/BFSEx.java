package com.algorithm.grammar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSEx {
  public static boolean[] visted = new boolean[9];
  public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
  
  //BFS 함수 정의
  //너비 우선 순위 맨 처음(큐), 큐 자료구조 이요
  public static void bfs(int start){
    Queue<Integer>  queue = new LinkedList<>();
    //맨처음 값 넣어
    queue.offer(start);
    //현재 노드 방문 처리
    visted[start] = true;
    //큐의 내용이 없을 때 까지 반복
    while(!queue.isEmpty()){
      //큐에서 하나의 원소를 뽑아 출력
      int x = queue.poll();
      System.out.println(x + " ");
      //해당 원소와 연결된, 아직 방문하지 않은 원소들을 삽입
      for (int i = 0; i < graph.get(x).size(); i++) {
        int y = graph.get(x).get(i);
        if(!visted[y]){
          queue.offer(y);
          visted[y] = true;
        }
      }
    }
  }
  
  public static void main(String[] args) {
    // 그래프 초기화
    for (int i = 0; i < 9; i++) {
      graph.add(new ArrayList<Integer>());
    }
  
    // 노드 1에 연결된 노드 정보 저장
    graph.get(1).add(2);
    graph.get(1).add(3);
    graph.get(1).add(8);
  
    // 노드 2에 연결된 노드 정보 저장
    graph.get(2).add(1);
    graph.get(2).add(7);
  
    // 노드 3에 연결된 노드 정보 저장
    graph.get(3).add(1);
    graph.get(3).add(4);
    graph.get(3).add(5);
  
    // 노드 4에 연결된 노드 정보 저장
    graph.get(4).add(3);
    graph.get(4).add(5);
  
    // 노드 5에 연결된 노드 정보 저장
    graph.get(5).add(3);
    graph.get(5).add(4);
  
    // 노드 6에 연결된 노드 정보 저장
    graph.get(6).add(7);
  
    // 노드 7에 연결된 노드 정보 저장
    graph.get(7).add(2);
    graph.get(7).add(6);
    graph.get(7).add(8);
  
    // 노드 8에 연결된 노드 정보 저장
    graph.get(8).add(1);
    graph.get(8).add(7);
  
    bfs(1);
  }
}
