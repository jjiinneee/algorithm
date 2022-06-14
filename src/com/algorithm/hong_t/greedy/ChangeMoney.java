package com.algorithm.hong_t.greedy;

import java.util.Arrays;

public class ChangeMoney {
  public int maxMoney(int n, int[] coin){
    int count = 0;

    for (int i = 0; i < coin.length; i++) {
      count += n/coin[i];
      n =  n% coin[i];
    }
    return count;
  }
  
  public static void main(String[] args) {
    ChangeMoney  c = new ChangeMoney();
    int[] coin = {500,100,50,10};
    int n = 1260;
    System.out.println(c.maxMoney(n,coin));
  }
}
