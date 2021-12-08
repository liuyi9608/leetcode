package com.eamon.leetcode.easy;

/**
 * @author: eamonliu
 * @date: 2021/11/24 15:01
 */
public class MySqrt {
    public static int mySqrt(int x) {
        if (x == 1)
            return 1;
        int min = 0; // 0
        int max = x; // 9
        while (max - min > 1) {
            int m = (max + min) / 2; // 4  // 0+4/2 = 2  2+2=4
            if (x / m < m) //9/4 = 2<4  9/2 = 4
                max = m;  //max = 4
            else
                min = m; //min = 2
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
}
