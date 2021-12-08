package com.eamon.leetcode.easy;

/**
 * @author: eamonliu
 * @date: 2021/11/24 14:44
 */
public class AddBinary {
    public static String addBinary(String a, String b) {
        return Long.toBinaryString((Integer.parseInt(a, 2) + Integer.parseInt(b, 2)));
    }

    public static void main(String[] args) {
        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
    

}
