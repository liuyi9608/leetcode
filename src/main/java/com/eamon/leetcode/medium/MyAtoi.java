package com.eamon.leetcode.medium;

/**
 * @author: eamonliu
 * @date: 2021/12/28 16:28
 * https://leetcode-cn.com/problems/string-to-integer-atoi/
 */
public class MyAtoi {

    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int length = s.length();
        int index = 0;
        char[] chars = s.toCharArray();

        //去空格
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                index++;
            } else {
                break;
            }
        }
        //纯空格就是0
        if (index == length) {
            return 0;
        }
        int flag = 1;
        if (chars[index] == '+') {
            index++;
        } else if (chars[index] == '-') {
            flag = -1;
            index++;
        }
        int result = 0;
        for (int i = index; i < length; i++) {
            if (chars[i] > '9' || chars[i] < '0') {
                break;
            }
            int charInt = Integer.parseInt(chars[i] + "");
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && charInt > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && charInt > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            result = result * 10 + flag * charInt;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("  -1234567"));
    }
}
