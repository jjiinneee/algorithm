package com.algorithm;

import java.util.Deque;
import java.util.LinkedList;

public class TrainComposition {
  
  private final Deque<Integer> wagons = new LinkedList<>();
  public void attachWagonFromLeft(int wagonId) {
    wagons.addFirst(wagonId);
  }
  
  public void attachWagonFromRight(int wagonId) {
    wagons.addLast(wagonId);
  }
  
  public int detachWagonFromLeft() {
    if(wagons.isEmpty()){
     
      throw new IndexOutOfBoundsException("No wagons available");
    }
    return wagons.removeFirst();
  }
  
  public int detachWagonFromRight() {
    if(wagons.isEmpty()) {
  
      throw new IndexOutOfBoundsException("No wagons available");
    }
    return wagons.removeLast();
  }
  
  public static void main(String[] args) {
    TrainComposition train = new TrainComposition();
    train.attachWagonFromLeft(7);
    train.attachWagonFromLeft(13);
    System.out.println(train.detachWagonFromRight()); // 7
    System.out.println(train.detachWagonFromLeft()); // 13
  }
}
