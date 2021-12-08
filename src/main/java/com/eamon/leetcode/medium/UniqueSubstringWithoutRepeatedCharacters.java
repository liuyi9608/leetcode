package com.eamon.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: eamonliu
 * @date: 2021/11/11 16:51
 * <p>
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class UniqueSubstringWithoutRepeatedCharacters {

    /**
     * [abcdabcde]
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < length; i++) {
            char c = chars[i];
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, i);
            result = Math.max(result, i - left + 1);
        }
        return result;
    }

    public static int test2(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(test2("abcaaabbbcccderf"));
    }
}
