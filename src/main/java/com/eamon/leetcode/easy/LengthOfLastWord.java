package com.eamon.leetcode.easy;

/**
 * @author: eamonliu
 * @date: 2021/11/24 14:27
 * <p>
 * https://leetcode-cn.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));
    }
}
