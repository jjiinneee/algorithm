package com.algorithm.hanbit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Antenna {
  
  
  //특정 위치의 집에 한개의 안테나를 설치하기로 함
  //효율성을 위해 안테나로부터 모든 집까지의 거리의 총합이 최소가 되도록 설치
  //안테나는 집이 위치한 곳에만 설치할 수 있고, 논리적으로 동일한 위치에 여러 개의 집이 존재하는 것이 가능
  //가장 작은 값을 출력해
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    //가운데가 가장 작은 값이 됨
    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
    }
  
    Collections.sort(arr);
  
    System.out.println(arr.get(n-1));
    System.out.println(arr.get((n-1) /2));
  }
}
