package com.algorithm.grammar;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
  public static void main(String[] args) {
    
    Queue<Integer> queue = new LinkedList<>();
    
    //삽입 5 - 삽입2 -삽입3 - 삽입7 -삭제 - 삽입1 -삽입4 - 삭제
    queue.offer(5);
    queue.offer(2);
    queue.offer(3);
    queue.offer(7);
    queue.poll();
    queue.offer(1);
    queue.offer(4);
    queue.poll();
    
    while(!queue.isEmpty()){
      System.out.println(queue.poll());
    }
    
    
    
    
  }
}
