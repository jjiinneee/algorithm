package com.algorithm.companyCodingTest;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.HashMap;

public class UniqueProduct {
  public static String firstUniqueProduct(String[] products) {
    String[] proLength = new String[products.length];
    if(proLength == null){
      return null;
    }
   // String str = Arrays.stream(products, 1,5);
//    String tt = null;
//    int index = 0;
//    System.out.println(proLength);
//    for (String str :  products){
//      if(index == 1){
//        tt = str;
//      }
//      index++;
//    }
//    if(products.length == 0){
//      return  null;
//    }
//
//    String str = null;
//    for (int i = 0; i < products.length; i++) {
//      if(i == 1){
//        str = products[i];
//      }
//
//    }
//    return str;
    return "4444";
  }
  
  public static void main(String[] args) {
    System.out.println(firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Bag"  }));
  }
}
