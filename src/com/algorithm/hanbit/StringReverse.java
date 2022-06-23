package com.algorithm.hanbit;

public class StringReverse {
  
  
  //모두 1인경우
  //모두 0인경우
  //둘중에 최소인값을 출력해!!
  public int reverse(String number){
    int result1 = 0;
    int result2 = 0;
    System.out.println(number.charAt(0));
    if(number.charAt(0) == '0'){
      result1 += 1;
    }else{
      result2 += 1;
    }
    
    
    for (int i = 0; i < number.length() -1; i++) {
      if(number.charAt(i) != number.charAt(i+1)){
        if(number.charAt(i+1) == '1'){
          result2+=1;
        }else{
          result1+=1;
        }
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
      }
    }
   
    return Math.min(result1,result2);
  }
  
  public static void main(String[] args) {
    StringReverse s = new StringReverse();
    String number = "0001100";
    System.out.println(s.reverse(number));
  }
}
