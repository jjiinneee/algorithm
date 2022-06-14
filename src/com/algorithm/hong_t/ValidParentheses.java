package com.algorithm.hong_t;

import java.util.Stack;

public class ValidParentheses {
  public boolean isValid(String s) {
    //{} [] () 각자 짝이 있네?
    if (s.length() % 2 != 0) {
      return false;
    }
  
    //s...
    Stack<Character> stack = new Stack<>();
    for (char chr: s.toCharArray()) {
      if(chr == '(' || chr == '{' || chr == '['){
        stack.push(chr);
      }else {
        if(stack.isEmpty()){
          return false;
        }
        switch (chr){
          case ')' :
            if(stack.peek() == '('){
              stack.pop();
            }else{
              return false;
            }
            break;
          case '}' :
            if(stack.peek() == '{'){
              stack.pop();
            }else{
              return false;
            }
            break;
          case ']':
            if(stack.peek() == '['){
              stack.pop();
            }else{
              return false;
            }
            break;
        }
      }
    
    }
    return stack.empty();
  }
  

  
  public static void main(String[] args) {
    
    String s = "()";
    ValidParentheses v = new ValidParentheses();
    v.isValid(s);
    System.out.println(v.isValid(s));
  }
}
