package com.algorithm.udemy;

public class SumZero {
  
  public int zero(int[] numbers){
//    for (int i = 0; i < numbers.length ; i++) {
//      for (int j = i+1; j < numbers.length; j++) {
//
//        if(numbers[i] + numbers[j] == 0){
//          System.out.println("num(i)" +  numbers[i]);
//        System.out.println("num(j)" +  numbers[j]);
//
//        }
//      }
//    }
    
    
    //다른방법
    int left = 0;
    int right = numbers.length -1;
    while(left < right){
      int sum = numbers[left] + numbers[right];
      if(sum == 0 ){
        System.out.println("left" + numbers[left]);
        System.out.println("right" + numbers[right]);
        return 0;
      }else if(sum > 0){
        right--;
      }else{
        left++;
      }

    }
    return 0;
  }
  
  public static void main(String[] args) {
    SumZero s = new SumZero();
//    int[] numbers = {-4,-3,-2,-1,0,1,2,5};
    int[] numbers = {-4,-3,-2,-1,0,5,10};
    System.out.println(s.zero(numbers));
  }
}
