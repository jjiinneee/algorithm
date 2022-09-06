package com.algorithm.programers;

import java.util.Arrays;

public class KNum {
  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];
  
    for (int i = 0; i <  commands.length; i++) {
      //System.out.println(commands[i][0]-1);
//      System.out.println(commands[i][1]);
//      System.out.println(commands[i][2]);
      
      
      int[] temp = Arrays.copyOfRange(array,commands[i][0]-1, commands[i][1]);
      Arrays.sort(temp);
  
      answer[i] = temp[commands[i][2]-1];
    }
    return answer;
  }
  
  public static void main(String[] args) {
    KNum k = new KNum();
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3},{4, 4, 1}, {1, 7, 3}};
    int[] answer = k.solution(array,commands);
    System.out.println(Arrays.toString(answer));
    //정답 563
  }
}

//배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
// commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요


//제한사항
//array의 길이는 1 이상 100 이하입니다.
//array의 각 원소는 1 이상 100 이하입니다.
//commands의 길이는 1 이상 50 이하입니다.
//commands의 각 원소는 길이가 3입니다.

//입출력 예 설명
//[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
//[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
//[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.