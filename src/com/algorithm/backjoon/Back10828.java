package com.algorithm.backjoon;

import java.util.Scanner;

public class Back10828 {
  
  //stack이 들어갈 자리 만들어줌
  //처음 아무것도 넣지 않았으니까 stack의 크기는 0으로 초기화 함
  public static int[] stack;
  public static int size = 0;
  
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();
    
    int num = sc.nextInt();
    stack = new int[num];
  
    for (int i = 0; i < num; i++) {
      String str = sc.next();
      switch (str){
        case "push":
          push(sc.nextInt());
          break;
  
        case "pop":
          stringBuilder.append(pop()).append('\n');
          break;
  
        case "size":
          stringBuilder.append(size()).append('\n');
          break;
  
        case "empty":
          stringBuilder.append(empty()).append('\n');
          break;
  
        case "top":
          stringBuilder.append(top()).append('\n');
          break;
      }
    }
    System.out.println(stringBuilder);
  }
  
  
  public static void push(int x){
    stack[size] = x;
    size++;
  }
  
  public static int pop(){
    if(size == 0){
      return -1;
    }
    
    else{
      //인덱스 0부터 시작하기때문에 최상단의 요소는 -1를 해줘야함
      int current = stack[size -1];
      stack[size -1] = 0;   // 0 초기화  제일 마지막에 넣은 값을 뺐으니까
      size--;
      return current;
    }
  }
  
  public static int size(){
    return size;
  }
  
  public static int empty(){
    if(size == 0){
      return 1;
    }else{
      return 0;
    }
  }
  
  public static int top(){
    if(size == 0){
      return -1;
    }else{
      return stack[size -1];
    }
  }
}


//14
//push 1
//push 2
//top
//size
//empty
//pop
//pop
//pop
//size
//empty
//pop
//push 3
//empty
//top