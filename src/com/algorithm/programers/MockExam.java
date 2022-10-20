package com.algorithm.programers;



import java.util.ArrayList;
import java.util.Arrays;

public class MockExam {
  public int[] solution(int[] answers) {
  
    int[] answer = {};
    int[] person1 = {1,2,3,4,5}; //이만큼씩 반복
    int[] person2 = {2,1,2,3,2,4,2,5};
    int[] person3 = {3,3,1,1,2,2,4,4,5,5};
    int count1=0, count2 =0, count3 =0;
  
    for(int i =0; i<answers.length; i++){
      if(person1[i%person1.length] == answers[i]) count1++;
      if(person2[i%person2.length] == answers[i]) count2++;
      if(person3[i%person3.length] == answers[i]) count3++;
    }
    int max = Math.max(Math.max(count1, count2),count3); // max값 구하기
    ArrayList<Integer> list = new ArrayList<Integer>();
    if(max==count1) list.add(1); //max값이랑 같으면 넣는다.
    if(max==count2) list.add(2);
    if(max==count3) list.add(3);
  
    answer = new int[list.size()];
  
    for(int i =0; i<answer.length; i++) {
      answer[i] = list.get(i);
    }
  
    return answer;
  }
  
  public static void main(String[] args) {
    MockExam m = new MockExam();
    int[] answer ={1,3,2,4,2};
    System.out.println(Arrays.toString(m.solution(answer)));
  }
}
