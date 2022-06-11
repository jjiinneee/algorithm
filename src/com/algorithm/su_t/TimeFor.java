package com.algorithm.su_t;

public class TimeFor {
  
  public int timeCount(int num){
    int count = 0;
    for (int i = 0; i <= num; i++) {
      boolean nums = String.valueOf(i).contains("3");
      if(nums){
        count += 60*60;
        continue;
      }
      for (int j = 0; j < 60; j++) {
        boolean jstr = String.valueOf(j).contains("3");
        if(jstr){
          count+= 60;
          continue;
        }
        count += 15;
//        for (int k = 0; k < 60; k++) {
//          boolean kstr = String.valueOf(k).contains("3");
//         if(kstr){
//           count++;
//         }
//        }
      }
    }
    
    return count;
  }
  
  public static void main(String[] args) {
    TimeFor s = new TimeFor();
  
    System.out.println(s.timeCount(5));
  }
}
