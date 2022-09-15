package com.algorithm.udemy;

public interface List<E> {
  
  boolean add(E value);     //리스트에 요소 추가 , 중복 허용하지 않을 경우 리스트에 중복 요소 있을때 false, 없으면 true
  
  void add(int index, E value);    //리스트에 요소를 특정 위치에 추가
  
  E remove(int index);      //리스트의 Index위치에 있는 요소를 삭제
  
  boolean remove(Object value);   //리스트에서 특정 요소 삭제, 동일 요소 여러개일 경우 가장 청므 발견한 요소 삭제
  
  E get(int index);   //리스트에 있는 특정 위치의 요소를 반환
  
  void set(int index, E value);       //리스트에서 특정위치에 있는 요소를 새 요소로 대체
  
  boolean contains(Object value);     //리스트에 특정 요소가 있는지 여부 확인
  
  int indexOf(Object value);    //리스트에서 위치를 찾음
                                // 일치하는 위치 반환 , 일치하지 않으면 -1 반
  
  int length();         // 리스트에 있는 요소의 갯수 반환
  
  boolean isEmpty();    //리스트가 비어있는지 확인
  
  public void clear();  //리스트에 있는 모든 요소 삭제
}
