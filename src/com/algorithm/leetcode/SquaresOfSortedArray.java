package com.algorithm.leetcode;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }

    public int[] sortedSquares2(int[] nums) {
        int[] squares = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squares[i] = nums[i] * nums[i];
        }

        int[] result = new int[nums.length];

        int lPointer = 0;
        int rPointer = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (squares[lPointer] < squares[rPointer]) {
                result[i] = squares[rPointer--];
            } else {
                result[i] = squares[lPointer++];
            }

        }


        return result;
    }

    public static void main(String[] args) {
        SquaresOfSortedArray s = new SquaresOfSortedArray();

        int[] nums1 = {-4,-1,0,3,10};
        int[] nums2 = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(s.sortedSquares2(nums1)));
        System.out.println(Arrays.toString(s.sortedSquares2(nums2)));

    }
}
