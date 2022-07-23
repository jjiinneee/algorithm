package com.algorithm.hanbit;

public class LuckyStrike {
  
  public String luckyNumber(int num){
    
    String number = String.valueOf(num);
    int length = number.length() / 2;
    int leftSum = 0;
    int rightSum = 0;
    for (int i = 0; i < number.length(); i++) {
      if( i < length ){
        leftSum += number.charAt(i) - '0';
      }else{
        rightSum += number.charAt(i) - '0';
      }
    }
    
    if(leftSum == rightSum){
      return "LUCKY";
    }else{
      return "READY";
    }
  }
  
  public static void main(String[] args) {
    LuckyStrike l = new LuckyStrike();
    int num = 123402;
    int num2 = 7755;
    System.out.println(l.luckyNumber(num));
    System.out.println(l.luckyNumber(num2));
  }
}
