package com.eamon.leetcode.medium;

import java.util.Arrays;

/**
 * @author: eamonliu
 * @date: 2022/1/25 15:20
 */
public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        if (target == result) {
            return result;
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (target == sum) {
                    return sum;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
                if (sum > target) {
                    right--;
                } else {
                    left++;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{1, 1, -1, -1, 3}, -1));
    }
}
