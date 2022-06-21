package com.algorithm.hanbit;

public class Decimal {
  
  //소수 판별 함수 (2이사으이 자연수에 대하여)
  public static boolean isPrimeNumber(int x){
    //2부터 x의 제곱근까지의 모든 수를 확인
    for (int i = 2; i <= Math.sqrt(x) ; i++) {
      if(x % i == 0){
        return false;   //소수 아님
      }
    }
    return true;   //소수
  }
  
  public static void main(String[] args) {
    System.out.println(isPrimeNumber(4));
    System.out.println(isPrimeNumber(7));
  }
}
