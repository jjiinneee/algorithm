package com.algorithm.udemy;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {
  
  private static final int DEFAULT_CAPACITY = 10;   //배열이 생성 될때 최초 할당 크기
  private static final Object[] EMPTY_ARRAY = {};   //빈 배열
  
  private int size; //요소 개수
  
  Object[] array;//요소 담을 배열
  
  //생성자1 (초기 공간 할당 x)  => 사용자가 공간 할당을 미리 안하고 객체만 생성하고 싶을 때
  // ArrayList<Integer> list = new ArrayList<>();
  public ArrayList(){
    this.array = EMPTY_ARRAY;
    this.size = 0;
  }
  //생성자2 (초기 공할 달당 ㅇ)  => 사용자가 데이터 개수 예측, 미리 공간 할당
  // ArrayList<Integer> list = new ArrayList<>(100);
  public ArrayList(int capacity){
    this.array = new Object[capacity];
    this.size = 0;
  }
  
  
  //데이터 동적할당 위한 resize
  //외부에서 마음대로 접근하면 X
  private void resize(){
    int array_capacity = array.length;
    if(Arrays.equals(array, EMPTY_ARRAY)){
      array = new Object[DEFAULT_CAPACITY];
      return;
    }
    
    //데이터가 꽉 찰 경우 공간을 늘려야함
    //현재 공간의 2배로 설정
    //새로운 공간을 배열에 넣어줌
    if(size  == array_capacity){
      int new_capacity = array_capacity * 2;
      
      array = Arrays.copyOf(array, new_capacity);
      return;
    }
    
    //데이터가 공간의 절반 미만으로 차지하는 경우
    //만약, 복사할 배열보다 공간의 크기가 작을 경우 새로운 용적까지만 복사하고 반환하기 때문에 예외발생에 안전
    if(size < (array_capacity / 2)){
      int new_capacity = array_capacity / 2;
      
      array = Arrays.copyOf(array, Math.max(new_capacity, DEFAULT_CAPACITY));
      return;
    }
  }
  
  @Override
  public boolean add(E value) {
    addLast(value);
    return true;
  }
  
  public void addLast(E value){
    //공간 꽉차있으면 resize();
    if(size == array.length){
      resize();
    }
    
    //마지막 위치에 요소 추가
    array[size] = value;
    size++;
  }
  
  @Override
  public void add(int index, E value) {
    if(index > size || index < 0){
      throw new IndexOutOfBoundsException();
    }
    
    if(index == size){   //index 마지막 위치면 addLast 메소드 요소 추가
      addLast(value);
    }else{
      if(size == array.length){ //꽉차있음 재할당
        resize();
      }
      
      //index 기준 후자에 있는 모든 요소들 한칸씩 뒤로 밀기
      for(int i = size; i> index; i--){
        array[i] = array[i-1];
      }
      
      array[index] = value;
      size++;
    }
  }
  
  public void addFirst(E value){
    add(0,value);
  }
  
  @SuppressWarnings("unchecked")
  @Override
  public E remove(int index) {
    if(index >= size || index < 0){
      throw new IndexOutOfBoundsException();
    }
    
    E element = (E) array[index];   //삭제될 요소를 반환하기 위해 임시로 담아둠
    array[index] = null;
  
    //항상 마지막 원소의 인덱스는 size보다 1작음!
    for (int i = index; i < size-1 ; i++) {
      array[i] = array[i+1];
      array[i+1] = null;
    }
    size--;
    resize();
    
    return element;
  }
  
  @Override
  public boolean remove(Object value) {
    
    //삭제하려는 인덱스 찾기
    int index = indexOf(value);
    
    //-1이면 array에 요소가 없다는 의미 false
    if(index == -1){
      return false;
    }
    
    //index 위치에 있는 요소 삭제
    remove(index);
    return true;
  }
  
  //배열의 위치 찾아가는 것
  //반드시 잘못된 위치 참조에 대한 예외처리 해주어야함
  @SuppressWarnings("unchecked")    //@SuppressWarnings("unchecked") 붙이지 않으면 type safe(타입 안정성)경고
  @Override
  public E get(int index) {
    if(index >= size || index < 0){
      throw new IndexOutOfBoundsException();
    }
    
    //object 타입에서 E타입으로 캐스팅 후 변환
    return (E) array[index];
  }
  
  @Override
  public void set(int index, E value) {
    if(index >= size || index < 0){
      throw new IndexOutOfBoundsException();
    }else{
      array[index] = value;
    }
  }
  
  @Override
  public boolean contains(Object value) {
    //0이상이면 요소가 존재!
    if(indexOf(value) >= 0){
      return true;
    }else{
      return false;
    }
  }
  
  @Override
  public int indexOf(Object value) {
    int i = 0;
    for (i = 0; i<size; i++){
      if(array[i].equals(value)){
        return i;
      }
    }
    return -1;
  }
  
  public int lastIndexOf(Object value){
    for (int i = size-1; i >= 0 ; i--) {
      if(array[i].equals(value)){
        return i;
      }
    }
    return -1;
  }
  
  @Override
  public int length() {
    return size;
  }
  
  @Override
  public boolean isEmpty() {
    return size == 0;
  }
  
  @Override
  public void clear() {
    for (int i = 0; i < size; i++) {
      array[i] = null;
    }
    size = 0;
    resize();
  }
}
