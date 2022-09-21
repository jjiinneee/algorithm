package com.algorithm.hanbit;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BigNumber {
  public int solution(int[] num){
    int n = 5;
    int m = 8;
    int k = 3;
    
    Arrays.sort(num);
    int first = num[n-1];
    int second = num[n-2];
    
    
    
    
    
    
    
    
    
    
    //가장 큰 수가 더해지는 횟수 계산
    int cnt = (m / (k+1)) * k;
    cnt+= m % (k+1);
    int result = 0;
    result += cnt * first;
    result += (m - cnt) * second;
    return result;
  }
  public static void main(String[] args) {
    BigNumber b = new BigNumber();
    int[] num = {2,4,5,4,6};
    System.out.println(b.solution(num));
  }
}
