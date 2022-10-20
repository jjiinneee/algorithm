package com.algorithm.companyCodingTest;

import com.algorithm.udemy.ArrayList;
import com.algorithm.udemy.List;

public class UserInput {
  
 
  public static class TextInput {
   protected StringBuilder stringBuilder;
   
   public TextInput(){
     stringBuilder = new StringBuilder();
   }
  
    public void add(char c) {
      this.stringBuilder.append(c);
    }
  
    public String getValue() {
     
      return this.stringBuilder.toString();
    }
  }
  
  public static class NumericInput extends TextInput {
    public NumericInput(){
      super();
    }
  
    @Override
    public void add(char c) {
      if(Character.isDigit(c)){
        this.stringBuilder.append(c);
      }
    }
  }
  
  public static void main(String[] args) {
    TextInput input = new NumericInput();
    input.add('1');
    input.add('a');
    input.add('0');
    System.out.println(input.getValue());
  }
}
