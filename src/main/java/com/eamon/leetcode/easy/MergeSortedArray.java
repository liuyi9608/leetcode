package com.eamon.leetcode.easy;

/**
 * @author: eamonliu
 * @date: 2021/11/29 14:17
 * <p>
 * https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2];
                p2++;
            } else if (p2 == n) {
                cur = nums2[p1];
                p1++;
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1];
                p1++;
            } else {
                cur = nums2[p2];
                p2++;
            }
            sorted[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i != m + n; i++) {
            nums1[i] = sorted[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 0, 0};
        merge(arr, 3, new int[]{2, 5, 6}, 2);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
