package com.eamon.leetcode.easy;

/**
 * @author: eamonliu
 * @date: 2021/11/23 18:07
 */
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int front = 0;
        int after = 1;
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            if (nums[front] == nums[after]) {
                after++;
            } else {
                front++;
                nums[front] = nums[after];
                after++;
            }
        }
        return front + 1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 9}));
    }

}
