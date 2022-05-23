package com.algorithm.su_t;

import java.util.Stack;

public class ValidParentheses {
  public boolean isValid(String s) {
    //{} [] () 각자 짝이 있네?
    if(s.length() %2 != 0){
      return false;
    }
    
    //s...
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < s.length(); i++) {
      switch (s.charAt(i)){
        case ')' :
            if(stack.peek() == '('){
              stack.pop();
            }
          break;
        case '}' :
          if(stack.peek() == '{'){
            stack.pop();
          }
          break;
        case ']' :
          if(stack.peek() == '['){
            stack.pop();
          }
          break;
        default:
          stack.push(s.charAt(i));
          break;
      }
    }
    return stack.empty();
//    return false;
  }
  
  
  public static void main(String[] args) {
    
    String s = "()";
    ValidParentheses v = new ValidParentheses();
    v.isValid(s);
    System.out.println(v.isValid(s));
  }
}
