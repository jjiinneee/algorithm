package com.algorithm.programers;

import java.util.Arrays;

public class KNumber {
  
  public int[] solution(int[] array, int[][] commands) {
    
    int[] answer = new int[commands.length];
    for (int m = 0; m < commands.length; m++) {
      System.out.println(commands[m][0] - 1);
      int[] copyArr = Arrays.copyOfRange(array,commands[m][0] - 1,commands[m][1]);
      Arrays.sort(copyArr);
   
      answer[m] = copyArr[commands[m][2] -1];
    }
    return answer;
  }
  
  public static void main(String[] args) {
    KNumber k = new KNumber();
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    int[] answer = k.solution(array,commands);
    System.out.println(Arrays.toString(answer));
  }
}
