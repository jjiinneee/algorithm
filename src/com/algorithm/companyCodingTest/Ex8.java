package com.algorithm.companyCodingTest;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex8 {
  
  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    String ipv4 = br.readLine();
    Scanner sc = new Scanner(System.in);
    
    String k = sc.nextLine();
    int len = k.length()%3;
    int tot = k.length();
    
    String[] arr = new String[len];
    String a = k.substring(0,3);
    String b = k.substring(3,6);
    String d = null;
    String c = null;
    if(tot < 12){
      for (int i = 0; i < len; i++) {
        arr[i] = k.substring(6, k.length()-len);
        arr[i] = k.substring(k.length()-len, tot);
      }
  
      System.out.println(a.concat(".")+b.concat("." )+ c.concat(".")+d);
    }
   
    
  }
}
