package com.algorithm.hong_t.greedy;

import java.util.Arrays;

public class AdventurerGuild {
 
  public int maximumGroups(int[] members){
    int count  = 0; // 총 그룹 갯수
    Arrays.sort(members);
    //정렬하니까 맨끝의 값이 젤 큰거
   // int localMax = 0; // 그룹 내 제일 겁쟁이
    int size = 0; // 그룹 인원수
    for (int i = 0; i < members.length; i++) {
     
     //localMax = members[i];
    //  System.out.println("localMa : " + localMax);
      size++;
      
      if (size >= members[i]) {
        System.out.println("members[i] : " + members[i]);
        System.out.println("그룹 결성");
        count++;
        size = 0;
      }
    }
    
    return count;
  }
  
  public static void main(String[] args) {
    AdventurerGuild s = new AdventurerGuild();
    int[] members = {2,3,1,2,2};
    System.out.println(s.maximumGroups(members));
  }
}

