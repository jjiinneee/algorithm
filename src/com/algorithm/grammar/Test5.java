package com.algorithm.grammar;

public class Test5 {
  public static void main(String[] args) {
    int[] arr = {3,4,10,2,5};
    
    int temp;
    for (int i = 0; i <= 3; i++) {
      for (int j = i+1; j <= 4 ; j++) {
        if(arr[i] < arr[j]){
          System.out.println("1 : " + arr[i]);
          temp = arr[i];
          System.out.println("2 : " +temp);
          arr[i] = arr[j];
          System.out.println("3 : " +arr[j]);
          System.out.println("4 : " + arr[i]);
          arr[j] = temp;
          System.out.println("5 : " +arr[j]);
          
          System.out.println("======================");
          
        }
      }
    }
  
    System.out.println( arr[1]);
  }
}
