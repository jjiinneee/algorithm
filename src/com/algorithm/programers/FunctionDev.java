package com.algorithm.programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FunctionDev {
  public int[] solution(int[] progresses, int[] speeds) {
    int[] answer = {};
  
    Queue<Integer> workDate = new LinkedList<>();  //개발 기간
    ArrayList<Integer> release = new ArrayList<>(); //배포당 기능 개수
  
    for (int i = 0; i < progresses.length; i++) {
      workDate.add((int) Math.ceil((double) (100-progresses[i] / speeds[i])));
    }
    int front = workDate.poll();
    int count = 1;
    while(!workDate.isEmpty()) {
      if (front < workDate.peek()) {
        release.add(count);
        count = 1;
        front = workDate.poll();
      } else {
        count++;
        workDate.poll();
      }
    }
    
    release.add(count);
    
    return release.stream().mapToInt(Integer::intValue).toArray();
  }
  
  public static void main(String[] args) {
   FunctionDev f = new FunctionDev();
   int[] progresses = {93, 30, 55};
   int[] speeds = {1, 30, 5};
  
  
//    int[] progresses = {95, 90, 99, 99, 80, 99};
//    int[] speeds = {1, 1, 1, 1, 1, 1};
   
   int[] answer = f.solution(progresses, speeds);
    System.out.println(Arrays.toString(answer));
   
  }
}
