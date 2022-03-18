package com.algorithm.ifAlgo;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firsts = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if(firsts == second &&  second == third){
            System.out.println(10000 + firsts * 1000);
        }else
        if(firsts == second || firsts == third){
            System.out.println(1000 + firsts * 100);
        }else if(second == third){
            System.out.println(1000 + second * 100);
        }else{
            System.out.println(Math.max(Math.max(firsts,second),third) * 100);
        }


    }
}
