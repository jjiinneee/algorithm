package com.algorithm.leetcode;

public class FindNumber {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i =0; i<nums.length;i++){
            int length = (int)(Math.log10(nums[i])+1);
            if(length % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]nums = {555,901,482,1771};
        int count = 0;
       for(int i=0; i<nums.length;i++){
           int length = (int)(Math.log10(nums[i])+1);
           if(length % 2 == 0){
               count++;

           }
         //  System.out.println(length);
       }
        System.out.println(count);

       //int형 숫자의 자리수 구하기
        // int length = (int)(Math.log10(test)+1);


       // System.out.println(length);
    }
}
