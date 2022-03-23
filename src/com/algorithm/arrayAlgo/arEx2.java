package com.algorithm.arrayAlgo;

import java.util.HashSet;
import java.util.Scanner;

public class arEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        
        Scanner sca = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            hashSet.add(sca.nextInt() % 42);
        }
        System.out.println(hashSet.size());
    }
}
