package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String arr[];
       String time = scanner.nextLine();

       int min = scanner.nextInt();
       arr =  time.split(" ");

       int hour  = Integer.parseInt(arr[0]);
       int hourMin  = Integer.parseInt(arr[1]);

       int totalMin = hourMin + min;

        if(totalMin > 59){
            min = totalMin - 60;
            hour++;
        }
        if(hour > 23 ){
            hour -=24;
        }
        System.out.println(hour + " " + min);
    }
}
