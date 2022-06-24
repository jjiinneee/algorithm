package com.algorithm.hanbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NoMakeMoney {
  
  public int makeMoney(int num,int[] money){
    int sum = 1;
  
   
    for (int i = 0; i < num; i++) {
        if(sum < money[i]){
          break;
        }else{
          sum+= money[i];
        }
    }
    return sum;
  }
  
  public static void main(String[] args) {
    NoMakeMoney n = new NoMakeMoney();
    int num = 5;
    int[] money = {3,2,1,1,9};
    
    System.out.println(n.makeMoney(num,money));
  }
}
