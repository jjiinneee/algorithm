package com.algorithm.udemy;

import java.util.NoSuchElementException;
import java.util.Queue;

public class ArrayQueue<E> implements QueueInterface<E> {
  
  private static final int DEFAULT_CAPACITY = 64;
  
  private Object[] array;
  private int size;
  
  private int front;   //시작 인덱스 (빈 공감임을 유의)
  private int rear;     //마지막 요소의 인덱스
  
  
  //생성자1(초기할당X)
  public ArrayQueue(){
    this.array = new Object[DEFAULT_CAPACITY];
    this.size = 0;
    this.front = 0;
    this.rear = 0;
  }
  
  //생성자2(초기할당o)
  public ArrayQueue(int capacity){
    this.array = new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = 0;
  }
  
  private void resize(int newCapacity){
    int arrayCapacity = array.length;     //현재 용적 크기
    
    Object[] newArray = new Object[newCapacity];
  
    
    /*
       i :  new array index
       j : original array
       index 요소 개수(size)만큼 새 배열에 값 복사
     */
    for (int i = 1, j = front+1; i <= size; i++ , j++) {
      newArray[i] = array[j % arrayCapacity];
    }
    this.array = null;
    this.array = newArray;   //새 배열을 기존 array의 배열로 덮어씌움
    
    front = 0;
    rear = size;
  }
  
  @Override
  public boolean offer(E item) {
    //용적 가득 찾을 경우
    if((rear + 1) % array.length == front){
      resize(array.length * 2);
    }
    
    rear = (rear + 1) % array.length;   //rear를  rear의 다음 위치로 갱신
    
    array[rear] = item;
    size++;
    
    return true;
  }
  
  @Override
  public E poll() {
    if(size == 0){
      return  null;
    }
    
    front = (front + 1) % array.length;  //front를 한칸 옮긴다.
    
    @SuppressWarnings("unchecked")
    E item = (E) array[front]; //데이터 임시 저장
    
    array[front] = null;    //해당 front 데이터 삭제
    size--;
    
    if(array.length > DEFAULT_CAPACITY && size < (array.length / 4)){
      resize(Math.max(DEFAULT_CAPACITY, array.length/2));
    }
    return item;
  }
  
  public E remove(){
    E item = poll();
    
    if(item ==null){
      throw new NoSuchElementException();
    }
    return item;
  }
  
  @Override
  public E peek() {
    
    //요소가 없을 경우 null 반환
    if(size == 0){
      return null;
    }
    
    @SuppressWarnings("unchecked")
    E item = (E) array[(front + 1) % array.length];
    return item;
  }
  
  public E element(){
    E item = peek();
    
    if(item == null){
      throw new NoSuchElementException();
    }
    return item;
  }
  
  public int size(){
    return size;
  }
  
  public boolean isEmpty(){
    return size == 0;
  }
  
  public boolean contains(Object value){
    int start = (front +1 ) % array.length;
    
    /*
      i : 요소 개수만큼 반복
      idx : 원소 위치로, 매회 (idx + 1) % array.length 위치로 갱신
     */
    for (int i = 0, idx= start; i < size ; i++, idx = (idx +1) % array.length) {
      if (array[idx].equals(value)){
        return true;
      }
    }
    return false;
  }
}
