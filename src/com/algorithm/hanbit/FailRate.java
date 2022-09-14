package com.algorithm.hanbit;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class Node1 implements Comparable<Node1>{
  private int stage;
  private double fail;
  
  public Node1(int stage, double fail) {
    this.stage = stage;
    this.fail = fail;
  }
  
  public int getStage() {
    return stage;
  }
  
  @Override
  public int compareTo(Node1 o) {
    if(this.fail == o.fail){
      return Integer.compare(this.stage, o.stage);
    }
    return Double.compare(o.fail, this.fail);
  }
}
public class FailRate {
  public int[] solution(int N, int[] stages) {
    //값 담을 배열
    int[] answer = new int[N];
  
    ArrayList<Node1> arrayList = new ArrayList<>();
    int length = stages.length;
  
    //스테이지 갯수 N
    for (int i = 1; i <= N; i++) {
      int cnt = 0;
      //사용자가 머물러 있는 스테이지 번호 배열 stages
      for (int j = 0; j < stages.length; j++) {
        if(stages[j] == i){
          cnt+=1;
        }
      }
      
      //실패율
      double fail = 0;
      if(length >= 1){
        fail = (double) cnt / length;
      }
      arrayList.add(new Node1(i, fail));
      length-= cnt;
    }
  
    Collections.sort(arrayList);
  
    for (int i = 0; i < N; i++) {
      answer[i] = arrayList.get(i).getStage();
    }
    return answer;
  }
  
  public static void main(String[] args) {
    FailRate f = new FailRate();
//    int n = 5;
//    int[] states = { 2,1,2,6,2,4,3,3};
    
    int n = 4;
    int[] states = { 4,4,4,4,4};
    System.out.println(Arrays.toString(f.solution(n, states)));
  }
}
