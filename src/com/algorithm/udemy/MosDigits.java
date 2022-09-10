package com.algorithm.udemy;

public class MosDigits {
  
  public int mosDigit(int[] arr){
  
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      count = Math.max(count, digitCount(arr[i]));
    }
    return count;
  }
  
  public int digitCount(int num){
   if(num == 0){
     return 1;
   }
    return (int) Math.floor(Math.log10(Math.abs(num))+1);
  }
  
  public static void main(String[] args) {
    MosDigits m = new MosDigits();
    int[] arr = {1234, 56, 75};
  
    System.out.println(m.mosDigit(arr));
    
  }
}
