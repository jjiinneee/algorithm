package com.algorithm.hanbit;

import java.util.HashMap;
import java.util.Map;

public class Balling {
  
  public int ball(int[] balls){
    int ballCount = balls.length;
    Map<Integer,Integer> temp =   new HashMap<Integer, Integer>();
    for (int weight: balls) {
      Integer weightCount = temp.get(weight);
      if (weightCount != null) {
        temp.put(weight,weightCount + 1);
      } else {
        temp.put(weight, 1);
      }
    }
    
    int cases = 0;
    for (int count : temp.values()) {
      cases += count * (ballCount - count);
    }
    
    return cases/2;
  }
  public static void main(String[] args) {
    Balling b = new Balling();
    int[] arr = {1,3,2,3,2};
    System.out.println(b.ball(arr));
  }
}
