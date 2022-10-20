package com.algorithm.companyCodingTest;

import java.util.ArrayList;
import java.util.HashMap;

public class Platformer {
  private int n;
  private int position;
  public Platformer(int n, int position) {
    this.n = n;
    this.position = position;
  }
  
  public void jumpLeft() {
    ArrayList<Integer> list = new ArrayList<Integer>();
  
    for (int i = 0; i < n; i++) {
      list.add(i);
    }
  
    int count =0;
    for (int i = 0; i < list.size(); i++) {
       count += list.get(i-1);
    }
    
  }
//
//  public void jumpRight() {
//    throw new UnsupportedOperationException("Waiting to be implemented.");
//  }
//
  public int position() {
    int result = 0;
  
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    
    for (int i = 0; i < n; i++) {
      list.add(i);
    }
  
    for(int li : list){
      if(li == position){
        result = li;
      }
    }
    return result;
  }
  
  public static void main(String[] args) {
    Platformer platformer = new Platformer(6, 3);
    System.out.println(platformer.position()); // should print 3
    
    platformer.jumpLeft();
    System.out.println(platformer.position()); // should print 1
//
//    platformer.jumpRight();
//    System.out.println(platformer.position()); // should print 4
  }
}
