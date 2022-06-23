package com.algorithm.programers;

import java.util.Arrays;

public class Lottos {
  
  public int[] solution(int[] lottos, int[] win_nums) {
    int count = 0;
    int zero = 0;
   
    for (int current : lottos) {
      if(current == 0){
        zero++;
        continue;
      }
      for (int winningNum : win_nums) {
        if(current == winningNum){
          count++;
          break;
        }
      }
    }
    
//    System.out.println("count : "+count);
//    System.out.println("test : " + zero);
    
    return new int[]{ranking(count + zero), ranking(count)};
  }
  
  private int ranking(int correct){
    if(correct < 2) {
      return 6; // 0개,1개 정답은 6등
    }
    return 7 - correct;
  }
  
  public static void main(String[] args) {
    Lottos s = new Lottos();
    int[] lottos = {0, 0, 0, 0, 0, 0};    //민우번호
    int[] win_nums = {38, 19, 20, 40, 15, 25};  //당첨번호
    
    //0 0 1  31 44  25
    //    1  31 45  6 10 19
    //3 5
    
    
    //31	10	45	1	6	19
    //31	0→10	44	1	0→6	25  (최고)
    //31	0→11	44	1	0→7	25  (최저)
    System.out.println(Arrays.toString(s.solution(lottos,win_nums)));
  }
}
