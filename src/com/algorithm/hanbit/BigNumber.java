package com.algorithm.hanbit;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BigNumber {
  
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    //숫자입력받고
    int num = sc.nextInt();
    
    //받은 숫자 넣을 배열선언
    int[] nums = new int[num];
  
    
    //숫자만큼 돌면서 받은 숫자 nums에 넣음
    int maxNum = Integer.MIN_VALUE;
    for (int i = 0; i < num; i++) {
      nums[i] = sc.nextInt();
//      if(nums[i] > maxNum){
//        maxNum = nums[i];
//      }
    }
    Arrays.sort(nums);
    int first = nums[nums.length -1];
    int second = nums[nums.length -2];
    System.out.println("Maximum number = " + first);
    System.out.println("Maximum number = " + second);
    
    //8번 더할거
    int plusNum = sc.nextInt();
    //같은 수 3번만 더해
    int sameNum = sc.nextInt();
    int cnt = 0;
    for (int i = 1; i <= plusNum; i++) {
      if(i == sameNum){
        cnt = first * sameNum;
      }
     cnt += second;
     
    }
  
  
    System.out.println(cnt);
  }
}
