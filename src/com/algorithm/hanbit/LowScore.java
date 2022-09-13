package com.algorithm.hanbit;

import java.util.*;


//성적이 낮은 순서로 학생 출력하기
//  input 2 홍길동 95 이순신 77

class Student implements Comparable<Student> {
  private String name;
  private int score;
  
  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }
  
  
  
  public String getName() {
    return name;
  }
  
  public int getScore() {
    return score;
  }
  
  
  @Override
  public int compareTo(Student o) {
    if(this.score < o.score){
      return -1;
    }
    return 1;
  }
}

public class LowScore {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
  
    List<Student> students = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      String name = sc.next();
      int score = sc.nextInt();
      students.add(new Student(name, score));
    }
  
    Collections.sort(students);
  
    for (int i = 0; i < students.size(); i++) {
      System.out.println(students.get(i).getName());
    }
   
  }
}
