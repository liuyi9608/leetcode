package com.eamon.leetcode.easy;

/**
 * @author: eamonliu
 * @date: 2021/11/23 17:21
 * <p>
 * https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String s = strs[0];
        for (String a : strs) {
            while (!a.startsWith(s)) {
                if (s.length() == 0) return "";
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"liuyi", "liuym", "lsas"}));
    }
}
