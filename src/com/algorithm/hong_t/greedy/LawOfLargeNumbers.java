package com.algorithm.hong_t.greedy;

import java.util.Arrays;

public class LawOfLargeNumbers {
  
  //m - 총 더해져야할 수
  //k - 연속적으로 붙을 수 있는 수
  public int LawNum(int[] number, int m, int k){
    Arrays.sort(number);
    int end = 0 ;
    int secondEnd = 0;
    
    end = number[number.length - 1];
    secondEnd = number[number.length - 2];
    
    int total = 0;
    for (int i = 0; i < m; i++) {
//      if(i> 0 && number[i] == number[i-1]){
//
//      }
        if(i%(k+1) == 0){
          total += secondEnd;
        }else{
          total+= end;
        }
    }

    
    
    return total;
  }
  public static void main(String[] args) {
    LawOfLargeNumbers s = new LawOfLargeNumbers();
    int[] number = {2,4,5,4,6};
    int m = 8;
    int k = 3;
    System.out.println(s.LawNum(number,m,k));
  }
}
