package com.algorithm.hanbit;

public class InsertSort {
  public static void main(String[] args) {
    
    //삽입 정렬은 필요할 때만 위치를 바꾸므로 '데이터가 정렬이 되어 있을 때' 훨씬 효율적
    //특정한 데이터가 적적한 위치에 들어가기 전에, 그 앞까지의 데이터는 정렬되어 있다고 가정
    // 삽입정렬은 두 번째 데이터부터 시작한다. 왜냐면 첫 번째 데이터는 그 자체로 정렬되어 있다고 판단하기 때문!
    int[] arr = {7,5,9,0,3,1,6,2,4,8};
    for (int i = 1; i < arr.length; i++) {
      //인덱스  i부터 1까지 감소하며 반복하는 문법
      for (int j = i; j > 0; j--) {
        //한 칸씩 왼쪽으로 이동
        System.out.println("arr[j] ===== " + arr[j]);
        System.out.println("arr[j-1] ===== " + arr[j-1]);
        if(arr[j] < arr[j-1]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1]  = temp;
        }else{
          break;
        }
      }
    }
  
    for (int i = 0; i < arr.length; i++) {
     // System.out.print(arr[i] + " ");
    }
  }
}
