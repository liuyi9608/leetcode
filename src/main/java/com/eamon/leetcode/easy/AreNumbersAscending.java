package com.eamon.leetcode.easy;

/**
 * @author: eamonliu
 * @date: 2021/11/25 10:56
 */
public class AreNumbersAscending {
    public static boolean areNumbersAscending(String s) {
        int num = 0;
        if (s == null || s == "") return false;
        String[] strArr = s.split(" ");
        for (String result : strArr) {
            char c = result.charAt(0);
            if (c >= '0' && c <= '9') {
                if (Integer.parseInt(result) > num) {
                    num = Integer.parseInt(result);
                } else {
                    return false;
                }

                //todo
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areNumbersAscending("1 aaa 21 bbb 11 ccc"));
    }
}
