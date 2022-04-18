package com.algorithm.dongyang;

public class InsertionSort {
 
  public static void pringArray(int[] a){
    for (int i = 0; i < a.length; i++) {
      System.out.println("[" + a[i] + "]");
    }
    System.out.printf("\n");
  }
  public static void main(String[] args) {
  
    int temp;
    
    int[] a= {90,34,78,12,56};
    System.out.println("정렬 전 배열");
    pringArray(a);
    
    // 삽입 정렬 오름차순 정렬
    int ins;
    int cmp;
    for ( ins = 0; ins < a.length; ins++) {
       temp = a[ins];
       for ( cmp = ins -1; cmp >=0; cmp--){
         //내림차순으로 변경하고 싶으면
         if(a[cmp] > temp){
           a[cmp+1] = a[cmp];
         }else{
           break;
         }
       }
       a[cmp+1] = temp;
    }
    System.out.println("정렬 후 배열");
    pringArray(a);
  }
}
