package com.algorithm.su_t;

public class AddDigits {
  public int addDigits(int num) {
    int current = num;
    while(true) {
      int sum = 0;
      while (current > 10) {
        sum += current % 10;
        current = current / 10;
      }
      sum += current;
      if (sum < 10) {
        return sum;
      }
      current = sum;
    }
  }
  
  public static void main(String[] args) {
    AddDigits s = new AddDigits();
//    s.addDigits(38);
    System.out.println(s.addDigits(38));
  }
}
