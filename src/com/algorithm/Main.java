package com.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

      int hour = scanner.nextInt();
      int min = scanner.nextInt();
      int secondMin = scanner.nextInt();

      int hourMin = hour * 60 + min + secondMin;
      hour = hourMin / 60;
      min = hourMin % 60;

      if(hour >=24){
          hour -= 24;
      }

        System.out.println(hour +" " + min);
    }
}
