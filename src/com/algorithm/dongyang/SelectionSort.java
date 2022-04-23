package com.algorithm.dongyang;

public class SelectionSort {
  public static void printArray(int[] a){
    for (int i = 0; i < a.length; i++) {
      System.out.println("[" + a[i] + "]");
    }
    System.out.printf("\n");
  }
  
  public static void main(String[] args) {
    int[] a ={90,34,78,12,56};
    System.out.println("정렬 전 배열");
    printArray(a);
    
    int  min,  temp;
    System.out.println(a.length);
    for (int i = 0; i < a.length; i++) {
        min = i;
      for (int j = i+1; j < a.length; j++) {
        if(a[j] < a[i]){
          min = j;
          temp = a[i];
          a[i] = a[min];
          a[min] = temp;
        }
      }
    }
    System.out.println("정렬 후 배열");
    printArray(a);
  }
}
