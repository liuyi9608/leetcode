package com.eamon.leetcode.medium;

/**
 * @author: eamonliu
 * @date: 2022/2/18 17:29
 * <p>
 * https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 */
public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < nums[right]) {
                //如果中间值比最右边的大，说明 0-mid是有序的，在这中间继续做二分法
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {3, 4, 5, 1, 2, 3};
        int search = search(ints, 1);
        System.out.println(search);
    }
}
