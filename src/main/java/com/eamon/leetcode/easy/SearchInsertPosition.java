package com.eamon.leetcode.easy;

/**
 * @author: eamonliu
 * @date: 2021/11/24 10:17
 * <p>
 * https://leetcode-cn.com/problems/search-insert-position/submissions/
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 2, 3, 4}, 3));
    }
}
