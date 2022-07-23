package com.algorithm.programers;


//level4..???
public class MusiMukbang {
  
  public int solution(int[] food_times, long k) {
    int answer = 0;
    int[] temp = new int[food_times.length];
    
    if(food_times.length < 0){
      return -1;
    }
  
    for (int i = 1; i <= k; i++) {
      
      System.out.println(food_times[i]);
    }
    
    return answer;
  }
  
  public static void main(String[] args) {
    int[] food_time = {3, 1, 2};
    long k = 5;
    
    MusiMukbang m = new MusiMukbang();
    System.out.println(m.solution(food_time,k));
  
  }
  
}
