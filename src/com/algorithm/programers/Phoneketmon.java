package com.algorithm.programers;

import java.util.HashSet;
import java.util.Set;

public class Phoneketmon {

    public int solution(int[] nums) {

        //set은 중복 불가
        Set<Integer> integerSet = new HashSet<>();

        for (int num : nums) {
            integerSet.add(num);
        }
    
        System.out.println("integerSet" + integerSet);
        return Math.min(integerSet.size(), nums.length/2);
    }
    public static void main(String[] args) {
        Phoneketmon p = new Phoneketmon();
        int[] nums = {3,1,2,3};
//        int[] nums = {3,3,3,2,2,4};
//        int[] nums = {3,3,3,2,2,2};
        System.out.println(p.solution(nums));
    }
}
