package com.algorithm.programers;

import java.util.HashMap;

public class DoNotPlayer {
  
  
  public String solution(String[] participant, String[] completion) {
  
    String answer = "";
    HashMap<String, Integer> map = new HashMap<>();
    for (String parti :  participant){
      map.put(parti,map.getOrDefault(parti, 0)+1 );
    }
    
    for (String complete  : completion){
      map.put(complete, map.get(complete) -1);
    }
    
    for (String key : map.keySet()){
      if(map.get(key) != 0){
        answer = key;
      }
    }
    
    
    return answer;
  }
  public static void main(String[] args) {
    DoNotPlayer d = new DoNotPlayer();
//    String[] participant = {"leo", "kiki", "eden"};
//    String[] completion = {"eden", "kiki"};
    String[] participant = {"mislav", "stanko", "mislav", "ana"};
    String[] completion = {"stanko", "ana", "mislav"};
    System.out.println(d.solution(participant,completion));
  }
}
