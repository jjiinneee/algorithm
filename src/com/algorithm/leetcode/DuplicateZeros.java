package com.algorithm.leetcode;

import java.util.Arrays;

public class DuplicateZeros {

    public void duplicateZeros(int[] nums) {

//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == 0){
//                for (int j = nums.length - 1; j > i; j--) {
//                    nums[j] = nums[j - 1];
//                }
//                if (i + 1 < nums.length) {
//                    nums[i + 1] = 0;
//                }
//                i++;
//            }
//        }
        int[] copy = Arrays.copyOf(nums, nums.length);
        for (int i = 0, pointer = 0; pointer < nums.length; i++, pointer++) {
            nums[pointer] = copy[i];
            if (copy[i] == 0) {
                nums[++pointer] = copy[i];
            }
        }

    }

    public static void main(String[] args) {
        DuplicateZeros duplicateZeros = new DuplicateZeros();

        int[] nums1 = {1,0,2,3,0,4,5,0};
        int[] nums2 = {1,0,2,3};

        duplicateZeros.duplicateZeros(nums1);
        duplicateZeros.duplicateZeros(nums2);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
