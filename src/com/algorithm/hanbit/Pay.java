package com.algorithm.hanbit;

public class Pay {
  public int getMinimumChange(int amount){
    int[] arr = {500,100,50,10};
    int result = 0;
    for (int i = 0; i < arr.length; i++) {
      // 2   = 1260 / 500
      result += amount / arr[i];
      //260 =
      amount = amount % arr[i];
    }
    
    return result;
  }
  public static void main(String[] args) {
    Pay s = new Pay();
    int amount1 = 3940;
  
    System.out.println(s.getMinimumChange(amount1));
  }
}
