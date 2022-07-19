package com.algorithm.leetcode;

import java.util.Arrays;

public class RichestCustomerWealth {
  public int maximumWealth(int[][] accounts) {
    int result = 0;
    for (int i = 0; i < accounts.length; i++) {
      int sum = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        sum += accounts[i][j];
      }
      result = Math.max(result,sum);
    }
    
    return result;
  }
  public static void main(String[] args) {
    RichestCustomerWealth r = new RichestCustomerWealth();
    int[][] accounts = {{1,2,3},{3,2,1}};
    System.out.println(r.maximumWealth(accounts));
    
  }
}
