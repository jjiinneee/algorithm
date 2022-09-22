package com.algorithm.udemy;

public interface QueueInterface<E> {
  
  boolean offer(E e);
  
  E poll();
  
  E peek();
}
