package com.eamon.leetcode.easy;

/**
 * @author: eamonliu
 * @date: 2021/11/23 19:12
 * <p>
 * https://leetcode-cn.com/problems/remove-element/comments/
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int point = 0;
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] != val) {
                nums[point] = nums[i];
                point++;
            }
        }
        return point + 1;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{1, 1, 2, 2, 4, 5, 6}, 2));
    }
}
