package com.eamon.leetcode.medium;

import java.util.Arrays;

/**
 * @author: eamonliu
 * @date: 2022/1/25 16:44
 */
public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        //从后往前找
        int length = nums.length;
        for (int i = length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                Arrays.sort(nums, i, length);
                for (int j = i; j < length; j++) {
                    if (nums[j] > nums[i - 1]) {
                        int temp = nums[j];
                        nums[j] = nums[i - 1];
                        nums[i - 1] = temp;
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums);

    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 8, 5, 7, 6, 4};
        nextPermutation(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }


    }
}
