package com.eamon.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: eamonliu
 * @date: 2022/1/25 11:39
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        int length = nums.length;
        if (length == 0) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int first = 0; first < length; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int third = length - 1;
            int target = -nums[first];
            for (int second = first + 1; second < length; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }

                while (second < third && nums[second] + nums[third] > target) {
                    third--;
                }
                if (second == third) {
                    break;
                }
                if (target == nums[second] + nums[third]) {
                    result.add(Arrays.asList(nums[first], nums[second], nums[third]));
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
