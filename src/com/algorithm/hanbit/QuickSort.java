package com.algorithm.hanbit;

public class QuickSort {
  //퀵정렬은 리스트에서 첫 번째 데이터를 피벗으로 정한다!
  //피벗을 설정한 후에 왼쪽에서 부터 피벗보다 큰 데이터를 찾고  오른쪽에서부터 피벗보다 작은 데이터를 찾는다.  => 분할,파티션
  //큰 데이터와 작은 데이터의 위치를 서로 교환!
  public static void quick(int[] arr, int start, int end){
    if(start >= end){
      return;
    }
    
    int pivot = start;  //  피벗은 첫번째 원소
    int left = start +1;
    int right = end;
    
    while(left <=right){
      while(left <= end && arr[left] <= arr[pivot]){
        left++;
      }
      while(right > start && arr[right] >= arr[pivot]){
        right--;
      }
      if(left > right){
        int temp = arr[pivot];
        arr[pivot] = arr[right];
        arr[right] = temp;
      }else{
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
      }
    }
    
    //분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
    quick(arr, start, right-1);   //왼쪽
    quick(arr, right+1, end);     //오른쪽
  
  }
  public static void main(String[] args) {
    int n = 10;
    int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
    
    quick(arr,0,n-1);
  
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i] + " ");
    }
  }
}
