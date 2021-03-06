package com.algorithm.leetcode;

public class SearchA2DMatrix {
  public boolean searchMatrix(int[][] matrix, int target) {
    
    //전체 탐색
//    for (int i = 0; i < matrix.length; i++) {
//      for (int j = 0; j < matrix[i].length; j++) {
//        if (matrix[i][j] ==  target){
//          return true;
//        }
//      }
//    }
//
    
    //값이 정렬되어 있기 때문에 이진탐색을 사용해도됨!
    int[] arr = new int [matrix.length * matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        arr[matrix[i].length *i  +j] = matrix[i][j];
      }
    }
    
    int start = 0;
    int end = arr.length;
    int mid = (start + end)/2;
    
    while(start < end){
      if(arr[mid] < target){
        start = mid+1;
      }else if(arr[mid] >  target){
        end = mid;
      }else{
        return  true;
      }
      mid = (start + end) /2;
    }
    return false;
  }
  
 
  
  public static void main(String[] args) {
    SearchA2DMatrix s = new SearchA2DMatrix();
    int[][] matrix = {{1,3,5,7},{10,11,16,20}, {23, 30, 34, 60}};
    int target = 3;
    
    System.out.println(s.searchMatrix(matrix,target));
  }
}
