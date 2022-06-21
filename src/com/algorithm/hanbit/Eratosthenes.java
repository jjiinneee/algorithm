package com.algorithm.hanbit;

import java.util.Arrays;

public class Eratosthenes {
  public static int n = 1000;   //2~1000까지 모든 수에 대하여 소수 판별
  public static boolean[] arr = new boolean[n + 1];
  
  public static void main(String[] args) {
    //Arrays.fill  배열의 모든 값을 같은 값으로 초기화하는 메서드
    //배열의 값 일정하게 초기화
    Arrays.fill(arr,true);  //처음 모든 수가 소수인(true)인 것으로 초기화
    //2부터 n의 제곱근까지의 모든 수 check
    for (int i = 2; i <= Math.sqrt(n) ; i++) {
      //i가 소수인 경우
      if(arr[i] == true){
        //i를 제외한 i의 모든 배수 지우기
        int j = 2;
        while( i * j <= n){
          arr[i * j] = false;
          j += 1;
        }
      }
    }
    //모든 소수 출력
    for (int i = 2; i <= n ; i++) {
      if(arr[i]){
        System.out.println(i+ " ");
      }
    }
  }
}
