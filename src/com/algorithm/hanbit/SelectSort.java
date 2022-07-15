package com.algorithm.hanbit;

public class SelectSort {
  //선택 정렬
  // 전체 데이터 중 가장 작은 데이터 선택하여 맨앞 데이터와 바꾼다!
  //1. 우선 전체 데이터를 돌린다
  //2. 배열의 0번째가 가장 작은 값이 올거니까 min_index에 i값을 넣는다.
  //3. 이중 for문을 돌리는 이유 >  for i 가 0일 때 for j 는 다음 원소들을 하나씩 비교해야하니까!
  //4. 만약 배열의 가장 작은 값이 for j의 배열의 값보다 클 때 가장 작은 원소값은 j로 변경된다.
  
  
  public static void main(String[] args) {
    int[] arr = {7,5,9,0,3,1,6,2,4,8};
    for (int i = 0; i < arr.length; i++) {
      int min_index = i;  //가장 작은 원소의 인덱스(0)
      for (int j = i+1; j <  arr.length; j++) {
        if(arr[min_index] >  arr[j]){
          min_index = j;
        }
      }
  
    
      
      int temp = arr[i];
      arr[i] = arr[min_index];
      arr[min_index] = temp;
    }
  
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
