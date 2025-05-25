package com.striver.java.leetcode;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums, int k) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
        int k = 4;
        System.out.println(maxSubArray(nums, k)); // Output: 6
    }
}