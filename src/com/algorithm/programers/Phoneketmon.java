package com.algorithm.programers;

import java.util.HashSet;
import java.util.Set;

public class Phoneketmon {

    public int solution(int[] nums) {

        Set<Integer> integerSet = new HashSet<>();

        for (int num : nums) {
            integerSet.add(num);
        }

        return Math.min(integerSet.size(), nums.length/2);
    }
    public static void main(String[] args) {
        
    }
}
