package com.algorithm.dongyang;

public class BubbleSort {
  public static void printArray(int[] a){
    for (int i =0; i<a.length; i++){
      System.out.println("[" + a[i] + "]");
    }
    System.out.printf("\n");
  }
  
  public static void main(String[] args) {
    int[] a = {90,34,78,12,56};
    
    int ins;
    int temp;
    int cmp;
    
    //정렬전
    printArray(a);
    
    //버블정렬로 오름차순
    for (ins = 0; ins<=a.length-1; ins++){
      for(cmp =0; cmp<a.length - ins-1; cmp++){
        if(a[cmp] > a[cmp+1]){
          temp = a[cmp];
          a[cmp] =  a[cmp+1];
          a[cmp+1] = temp;
        }
      }
    }
    printArray(a);
  }
}
