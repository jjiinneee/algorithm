package com.algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestResults {
  public static class Student implements Comparable<Student>{
    private String name;
    private int score;
    
    public Student(String name, int score) {
      this.name = name;
      this.score = score;
    }
    
    public int getScore() {
      return score;
    }
    
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    
    public void setScore(int score) {
      this.score = score;
    }
    @Override
    public int compareTo(Student o) {
      return Integer.compare(score,o.score);
    }
  }
  //static List<String>
  public static List<String>  studentsThatPass(Stream<Student> students, int passingScore) {
    List<String>  str= new ArrayList<String>();
   // throw new UnsupportedOperationException("Waiting to be implemented.");
    // students.forEach(student -> System.out.println(student.getName()));
     students.sorted(Comparator.reverseOrder()).forEach(
             student -> {
               if(student.getScore() >= passingScore){
                 str.add(student.getName());
                 //System.out.println(student.getName());
               }
             }
     );
    
     
     return str;
  }
  
  public static void main(String[] args) {
    
    List<Student> students = new ArrayList<Student>();
    
    students.add(new Student("Mike", 80));
    students.add(new Student("James", 57));
    students.add(new Student("Alan", 21));
    //studentsThatPass(students.stream(), 50);
    
    studentsThatPass(students.stream(), 50).forEach(System.out::println);
  }
}
