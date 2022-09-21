package com.algorithm.hanbit;

import java.util.Scanner;

public class CardGame {
  //  public int biggestNum(int row, int col, int[][] matrix) {
//      Scanner sc = new Scanner(System.in);
//
//      row = sc.nextInt();
//      col = sc.nextInt();
//      int[][] test = new int[row][col];
//
//      for (int i = 0; i < test.length; i++) {
//        String[] arr = sc.nextLine().split(" ");
//        for (int j = 0; j < arr.length; j++) {
//         // if(arr[i]  arr[j])
//        }
//      }
  
//      int maxNum = Integer.MIN_VALUE;
//      for (int i = 0; i < matrix.length; i++) {
//        int minOfRow = Integer.MAX_VALUE;
//        for (int j = 0; j < matrix[i].length; j++) {
//          if(matrix[i][j] < minOfRow){
//            minOfRow = matrix[i][j];
//          }
//        }
//        if(minOfRow > maxNum){
//          maxNum = minOfRow;
//        }
//
//      }
//
//      return maxNum;
 
 
      
 //   }
    
    public static void main(String[] args) {
//      CardGame s = new CardGame();
//      int row1 = 3;
//      int col1 = 3;
//      int[][] matrix1 = {
//              {3, 1, 2},
//              {4, 1, 4},
//              {3, 2, 5}
//      };
//
//      int row2 = 4;
//      int col2 = 3;
//      int[][] matrix2 = {
//              {3, 1, 2},
//              {4, 1, 4},
//              {3, 2, 5},
//              {3, 7, 4}
//      };
//
//      System.out.println(s.biggestNum(row1, col1, matrix1)); // 2
//      System.out.println(s.biggestNum(row2, col2, matrix2)); // 3
      
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int result = 0;
  
      for (int i = 0; i < n; i++) {
        int min_value = 10001;
        for (int j = 0; j < m; j++) {
          int x = sc.nextInt();
          min_value = Math.min(min_value, x);
        }
        result = Math.max(result, min_value);
      }
  
      System.out.println(result);
      
    }
}
