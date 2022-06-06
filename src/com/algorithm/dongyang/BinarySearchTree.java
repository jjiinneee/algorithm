package com.algorithm.dongyang;

public class BinarySearchTree {
  public static BST[] tree = new BST[10];
  
  public static int rootIdx = 0;
  public static int newIdx = 0;
  
}

class BST{
  public int data;  //요소값
  public int left;    //왼쪽 요소의 연결 정보
  public int right;   //오른쪽 요소의 연결 정보
  
}
