package com.algorithm.programers;


import java.util.LinkedList;
import java.util.Queue;

public class MapSorts {
  
  int[] dx = {1,0,-1,0};
  int[] dy = {0, 1, 0, -1};
  
  
  public int solution(int[][] maps) {
    int answer = 0;
  
    //방문
    int[][] visited = new int[maps.length][maps[0].length];
    bfs(maps, visited);
    answer = visited[maps.length-1][maps[0].length-1];
    
    if(answer == 0){
      answer =  -1;
    }
    
    return answer;
  }
  
  public void bfs(int[][] maps, int[][] visited){
   int x = 0;
   int y = 0;
   
   visited[x][y] = 1;
   Queue<int[]> que  = new LinkedList<>();
   que.add(new int[]{x,y});     //초기화
   
   while(!que.isEmpty()){
     int[] current = que.poll();
     int cX = current[0];
     int cY = current[1];
  
     for (int i = 0; i < 4; i++) {
       int nX = cX + dx[i];
       int nY = cY + dy[i];
       
       if(nX < 0 || nX > maps.length-1 || nY < 0 || nY > maps[0].length -1){
         continue;
       }
       if(visited[nX][nY] == 0 && maps[nX][nY] == 1){
         visited[nX][nY] = visited[cX][cY] +1;
         que.add(new int[]{nX, nY});
       }
     }
     
   }
  }
  
  public static void main(String[] args) {
    MapSorts m = new MapSorts();
    int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
    System.out.println(m.solution(maps));
  }
}
