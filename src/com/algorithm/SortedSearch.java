package com.algorithm;

public class SortedSearch {
  public static int countNumbers(int[] sortedArray, int lessThan) {
    int cnt = 0;
    
    for (int sort : sortedArray){
      if(sort < lessThan ){
        cnt++;
      }else{
        break;
      }
      
     
    }
    return cnt;
  }
  
  public static void main(String[] args) {
    System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
  }
}
