package com.eamon.leetcode.easy;

/**
 * @author: eamonliu
 * @date: 2021/11/24 14:32
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[length + 1];
        digits[0] = 1;

        return digits;
    }

    public static void main(String[] args) {
        int[] ints = plusOne(new int[]{9, 9, 9});
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
