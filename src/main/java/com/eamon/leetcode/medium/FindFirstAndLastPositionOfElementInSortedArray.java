package com.eamon.leetcode.medium;

/**
 * @author: eamonliu
 * @date: 2022/2/18 17:49
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target, true);
        int right = -1;
        if (left > -1) {
            right = binarySearch(nums, target, false);
        }
        return new int[]{left, right};
    }


    /**
     * 使用二分法查询target位置
     *
     * @param nums
     * @param target
     * @param flag   true-查询左边第一个，false-查询右边第一个
     * @return
     */
    public static int binarySearch(int[] nums, int target, boolean flag) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                result = mid;
                if (flag) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 2, 3, 3, 3, 4}, 3, false));
    }
}
