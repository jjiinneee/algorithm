package com.algorithm.grammar;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
  public static void main(String[] args) {
    Map<String,Object> map = new HashMap<String,Object>();
    map.put("str","text");
    map.put("int", 123232);
    System.out.println(map.get("str"));
    System.out.println(map.get("int"));
    System.out.println(map.get("str").getClass().getName());
    System.out.println(map.get("int").getClass().getName());
  }
}
