package com.algorithm.programers;

public class TargetNumber {
  
  static int answer = 0;
  public int solution(int[] numbers, int target) {
    answer = 0;
    dfs(numbers,target,0,0);
    return answer;
  }
  
  public void dfs(int[] numbers, int target, int idx, int sum){
    if(idx == numbers.length){
      if(sum == target){
        answer++;
      }
    }else{
      dfs(numbers, target,idx+1,  sum+numbers[idx]);
      dfs(numbers, target,idx+1,  sum-numbers[idx]);
    }
 
    
  }
  
  public static void main(String[] args) {
    TargetNumber t = new TargetNumber();
//    int[] numbers = {1,1,1,1,1};
//    int target = 3;
    int[] numbers = {4, 1, 2, 1};
    int target = 4;
    System.out.println(t.solution(numbers, target));
  }
}
