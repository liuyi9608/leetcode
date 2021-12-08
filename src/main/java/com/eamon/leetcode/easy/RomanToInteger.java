package com.eamon.leetcode.easy;

/**
 * @author: eamonliu
 * @date: 2021/11/23 17:02
 * <p>
 * https://leetcode-cn.com/problems/roman-to-integer/
 */
public class RomanToInteger {

    public static int romanToInt(String s) {
        s = s.replace("IV", "a");
        s = s.replace("IX", "b");
        s = s.replace("XL", "c");
        s = s.replace("XC", "d");
        s = s.replace("CD", "e");
        s = s.replace("CM", "f");


        int length = s.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            result += getValue(s.charAt(i));
        }
        return result;
    }

    public static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            case 'a':
                return 4;
            case 'b':
                return 9;
            case 'c':
                return 40;
            case 'd':
                return 90;
            case 'e':
                return 400;
            case 'f':
                return 900;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}
