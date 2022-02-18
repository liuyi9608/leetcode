package com.eamon.leetcode.medium;

/**
 * @author: eamonliu
 * @date: 2022/1/25 11:15
 */
public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int size = height.length;
        if (size == 0) {
            return 0;
        }
        int left = 0;
        int right = size - 1;
        int area = 0;
        while (left < right) {
            area = Math.max(area, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

}
