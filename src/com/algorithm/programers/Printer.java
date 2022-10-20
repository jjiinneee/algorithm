package com.algorithm.programers;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
  public int solution(int[] priorities, int location) {
    int answer = 0;
  
    PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
  
    for (int i = 0; i < priorities.length; i++) {
      q.add(priorities[i]);
    }
    
    while(!q.isEmpty()){
      for (int i = 0; i < priorities.length; i++) {
        if(priorities[i] == q.peek()){
          if(i == location){
            answer++;
            return answer;
          }
          q.poll();
          answer++;
        }
      }
    }
    
    return -1;
  }
  
  public static void main(String[] args) {
    Printer p = new Printer();
//    int[] priorities = {2,1,3,2};
//    int location = 2;
    int[] priorities = {1,1,9,1,1,1};
    int location = 0;
    System.out.println(p.solution(priorities,location));
  }
}
