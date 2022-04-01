package com.algorithm.backjoon;

import java.util.Scanner;

public class StrEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 =  scanner.nextInt();

        number1 = Integer.parseInt(new StringBuilder().append(number1).reverse().toString());
        number2 = Integer.parseInt(new StringBuilder().append(number2).reverse().toString());

       if(number1 > number2){
           System.out.println(number1);
       }else{
           System.out.println(number2);
       }
    }
}
