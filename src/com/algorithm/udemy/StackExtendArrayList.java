package com.algorithm.udemy;

import java.util.EmptyStackException;

public class StackExtendArrayList<E> extends ArrayList<E> implements StackInterface<E> {
  
  //초기 용적 할당 X
  public StackExtendArrayList(){
    super();
  }
  //초기 용적 할당 O
  public StackExtendArrayList(int capacity){
    super(capacity);
  }
  
  @Override
  public E push(E item) {
    addLast(item);
    return item;
  }
  
  @Override
  public E pop() {
    int length = size();
    E obj = remove(length -1);
    return obj;
  }
  
  //arrayList > get
  @Override
  public E peek() {
    int length = size();
    if(length == 0){
      throw new EmptyStackException();
    }
  
    E obj = get(length -1);
    return  obj;
  }
  
  //arrayList >  lastIndexOf
  @Override
  public int search(Object value) {
  
    int idx = lastIndexOf(value);
    
    if(idx >= 0){
      return size() - idx;
    }
    return -1;
  }
  
  @Override
  public int size() {
    return 0;
  }
  
  @Override
  public boolean empty() {
    return size() == 0;
  }
}
