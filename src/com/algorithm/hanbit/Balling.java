package com.algorithm.hanbit;

import java.util.HashMap;
import java.util.Map;

public class Balling {
  
  public int ball(int[] arr){
  
    Map<Integer,Integer> temp =   new HashMap<Integer, Integer>();
    temp.put(1,1);
    temp.put(2,3);
    temp.put(3,2);
    temp.put(4,3);
    temp.put(5,2);
    
    
    return 0;
  }
  public static void main(String[] args) {
    Balling b = new Balling();
    int[] arr = {1,3,2,3,2};
    System.out.println(b.ball(arr));
  }
}
