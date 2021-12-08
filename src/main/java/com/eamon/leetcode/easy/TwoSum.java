package com.eamon.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: eamonliu
 * @date: 2021/11/11 10:39
 * <p>
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {

    /**
     * 解题思路：
     * 1、循环两次数组，取符合条件的，时间复杂度 O(n2)
     * 2、利用map，顺序遍历整个数组，如果在map中能找到匹配的另一个数字，那么就直接返回2个数字的位置
     * 如果没找到，就把这个数字存入map，等找到另一个时返回
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int[] index = new int[2];

        //key为另一半数字，value为数组下标
        Map<Integer, Integer> map = new HashMap<>();

        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                index[0] = i;
                index[1] = map.get(nums[i]);
                return index;
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 2, 3, 6, 5, 7, 9, 0, 8};
        int target = 14;
        int[] result = twoSum(nums, target);
        if (result != null) {
            for (int i : result) {
                System.out.println(i);
            }
        }

    }
}
