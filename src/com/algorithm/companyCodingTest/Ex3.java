package com.algorithm.companyCodingTest;

import java.util.*;

public class Ex3 {
  
  public int solution(String[][] map3d){
    int answer = 0;
    //시작 지점에서 끝 지점으로 가는 것이 불가능하다면 -1을 대신 return
//    for (int i = 0; i < map3d.length; i++) {
//      String[] mapArr = map3d[i];
//      for (int j = 0; j < mapArr.length; j++) {
//        if(mapArr.equals("E")){
//          answer +=1;
//        }else if(mapArr.equals("O")) {
//
//        }
//
//      }
//    }
  
    
    int[] dx = {0,1,0,-1};
    int[] dy = {1,0,-1,0};
    
  
    for (int i = 0; i < map3d.length; i++) {
      for (int j = 0; j < map3d[i].length; j++) {
        int falg = 1;
        for(int k=0; k< 4; k++){
          int nx = i + dx[k];
          int ny = j+dy[k];
          
        }
        answer++;
      }
    }
    
    return answer;
  }
  
  public static void main(String[] args) {
    Ex3 e = new Ex3();
//    String[][] map3d = {{"SOXX","OOXX"},{"XXOO", "XXOE"}};
    String[][] map3d = {{"XXXXX","OOSXO","OOXOO"},{"XEOOO", "OXXXO","OOOOX"}};
    System.out.println(e.solution(map3d));
  }
}

