package com.algorithm.companyCodingTest;


import java.util.HashSet;
import java.util.Set;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
      //throw new UnsupportedOperationException("Waiting to be implemented.");
      Set<String> list = new HashSet<>();
      for(String name : names1){
        list.add(name);
      }
      for (String name :  names2){
        list.add(name);
      }
      String[] test = list.toArray(new String[list.size()]);
      return test;
    }
    
    public static void main(String[] args) {
      String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
      String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
    
      System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
