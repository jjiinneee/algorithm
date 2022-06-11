package com.algorithm.su_t;

public class UntilOne {
  
  public int operationCountUntilOne(int N, int K) {
    int count = 0;
    // /몫    %나머지
    while(N != 0){
      int remainder = N % K;
      if(remainder != 0){
        count += remainder;
        N -= remainder;
      }else{
        N =  N  / K;
        count++;
      }
    }
    return count - 1;
  }
  
  public static void main(String[] args) {
    UntilOne s = new UntilOne();
    
   System.out.println(s.operationCountUntilOne(25, 7)); // 7
    System.out.println(s.operationCountUntilOne(25, 5)); // 2
  }
  
}
