package com.algorithm.udemy;

public class DoubleNode<E> {
  
  E data;
  DoubleNode<E> next;
  DoubleNode<E> prev;
  
  DoubleNode(E data){
    this.data = data;
    this.prev = null;
    this.next = null;
  }
  
}
