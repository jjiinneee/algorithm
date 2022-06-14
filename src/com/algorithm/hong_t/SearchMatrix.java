package com.algorithm.hong_t;

public class SearchMatrix {
//  public boolean searchMatrix(int[][] matrix, int target) {
//
//    for (int i = 0; i < matrix.length; i++) {
//      for (int j = 0; j < matrix[i].length; j++) {
//        //3 2  target = 3
//        if(matrix[i][j] == target){
//          return true;
//        }
//      }
//    }
//
//    return false;
//  }
  
  public boolean searchMatrix(int[][] matrix, int target) {
    
   int[] arr = new int[matrix.length * matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        arr[matrix[i].length * i +j] = matrix[i][j];
      }
    }
    
    int start = 0;
    int end = arr.length;
    int mid = (start + end) /2;
    
    
    while(start < end){
      if(arr[mid] <target){
        start  = mid +1;
      }
      else if(arr[mid] > target){
        end = mid;
      }else{
        return true;
      }
      mid = (start + end ) /2;
    }
    
    return false;
  }
  
  public static void main(String[] args) {
   int[][]  matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
   int target = 5;
   
   SearchMatrix s = new SearchMatrix();
   s.searchMatrix(matrix,target);
    System.out.println(s.searchMatrix(matrix,target));
  }
}
