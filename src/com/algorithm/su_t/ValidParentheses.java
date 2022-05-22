package com.algorithm.su_t;

public class ValidParentheses {
  public boolean isValid(String s) {
    //{} [] () 각자 짝이 있네?
    if(s.length() %2 != 0){
      return false;
    }
    
    //s...
    return false;
  }
  
  
  public static void main(String[] args) {
    
    String s = "()";
    ValidParentheses v = new ValidParentheses();
    v.isValid(s);
    System.out.println(v.isValid(s));
  }
}
