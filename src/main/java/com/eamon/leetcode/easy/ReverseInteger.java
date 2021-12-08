package com.eamon.leetcode.easy;

/**
 * @author: eamonliu
 * @date: 2021/11/18 11:31
 * <p>
 * https://leetcode-cn.com/problems/reverse-integer/
 */
public class ReverseInteger {

    public static boolean reverse(int x) {
        int result = 0;
        int origin = x;
        if (x < 0) return false;
        while (x != 0) {
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) return false;
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return origin == result;
    }

    public static void main(String[] args) {
        int x = 131;
        System.out.println(reverse(x));
    }
}
