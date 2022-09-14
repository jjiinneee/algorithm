package com.algorithm.hanbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class GawMok implements Comparable<GawMok>{

  private String name;
  private int guk;
  private int young;
  private int su;
  
  public GawMok(String name, int guk, int young, int su) {
    this.name = name;
    this.guk = guk;
    this.young = young;
    this.su = su;
  }
  
  public String getName() {
    return name;
  }
  
  
  //1.국어 점수가 감소 하는 순서로
  //2. 국어 점수가 같으면 영어 점수가 증가하는 순서로
  //3. 국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
  //4. 모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로
  //(단 아스키코드에서 대문자는 소문자보다 작으므로 사전 순으로 앞에 옵니다.)
  
  @Override
  public int compareTo(GawMok other) {
    if(this.guk == other.guk && this.young == other.young && this.su == other.su){
      return this.name.compareTo(other.name);
    }
    if(this.guk == other.guk && this.young == other.young){
      return Integer.compare(other.su, this.su);   //감소
    }
    if(this.guk == other.guk){
      return Integer.compare(this.young, other.young);  //증가
    }
  return Integer.compare(other.guk, this.guk);   //감소
  }
}

public class GukYoungSu {
  
  //도현이네 반학생 N명의 이름과 국,영,수학점수가 주어짐
  

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int n = s.nextInt();
  
    ArrayList<GawMok> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      String name = s.next();
      int guk = s.nextInt();
      int young = s.nextInt();
      int su = s.nextInt();
      list.add(new GawMok(name, guk, young, su));
    }
  
    Collections.sort(list);
  
    for (int i = 0; i < n; i++) {
      System.out.println(list.get(i).getName());
    }
  }
  
}
