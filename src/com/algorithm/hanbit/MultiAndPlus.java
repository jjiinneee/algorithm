package com.algorithm.hanbit;

public class MultiAndPlus {
  
  public int retunMutiSum(int[] number){
    int result = 1;
    for (int i = 1; i < number.length; i++) {
      
      //0,1이 나오면 더하기 했을 때 더 많은 값이 출력
      // 그외 숫자가 나오면 곱하기 했을때 더 많은 값 출력
      if (number[i] <= 1) {
        result += number[i];
      } else {
        result *= number[i];
      }
    }
    return result;
  }
  
  public static void main(String[] args) {
    MultiAndPlus s = new MultiAndPlus();
    int[] inputTest = {0,2,9,8,4};
    System.out.println(s.retunMutiSum(inputTest));
  }
}
