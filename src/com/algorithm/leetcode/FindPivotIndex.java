package com.algorithm.leetcode;

public class FindPivotIndex {
    public int pivotIndex(int[] arr) {
        int result = -1;

        int[] sums = new int[arr.length];
        sums[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            sums[i] = sums[i - 1] + arr[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            int rightSum = (sums[sums.length - 1] + arr[arr.length - 1]) - (sums[i] + arr[i]);
            int leftSum = sums[i];
            if (rightSum == leftSum) {
                result = i;
                break;
            }
        }

        return result;
    }

    public int pivotIndex2(int[] arr) {
        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            int rightSum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,7,3,6,5,6};

        FindPivotIndex findPivotIndex = new FindPivotIndex();

        System.out.println(findPivotIndex.pivotIndex(nums1));
    }
}
