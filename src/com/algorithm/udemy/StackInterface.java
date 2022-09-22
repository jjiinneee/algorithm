package com.algorithm.udemy;

public interface StackInterface<E> {
  
  E push(E item);   //스택 맨 위에 요소 추가 add
  
  E pop();      //맨 위 요소 제거, 제거된 요소 반환 remove
  
  E peek();     //맨위에 있는 요소 제거하지 않고 반환
  
  int search(Object value);   //위치 반환(상단으로부터 몇 번째에 위치 하는지)
  
  int size();
  
  void clear();
  
  boolean empty();
}
