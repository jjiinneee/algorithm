package com.algorithm.leetcode;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
             } else {
                count = 0;
            }
            result = Math.max(result, count);
        }
        return result;
    }


    public static void main(String[] args) {

    }
}
