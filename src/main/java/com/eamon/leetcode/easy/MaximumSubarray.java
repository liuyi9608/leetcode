package com.eamon.leetcode.easy;

/**
 * @author: eamonliu
 * @date: 2021/11/24 10:31
 * <p>
 * https://leetcode-cn.com/problems/maximum-subarray/
 */
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int res = 0;
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-10, -20, 999, -100, 19999}));
    }
}
