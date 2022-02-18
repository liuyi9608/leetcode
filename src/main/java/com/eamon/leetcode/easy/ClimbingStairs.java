package com.eamon.leetcode.easy;

import java.util.Map;

/**
 * @author: eamonliu
 * @date: 2021/11/25 11:20
 */
public class ClimbingStairs {

    public static int climbStairs(int n) {
        int b = 0, result = 1, a;
        for (int i = 1; i <= n; i++) {
            a = b;
            b = result;
            result = a + b;
        }
        return result;
        // Map<Integer, Integer> map = new HashMap<>(n);
        // return sum(n, map);
    }

    public static int sum(int n, Map<Integer, Integer> map) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        if (n == 1) {
            map.put(n, 1);
        } else if (n == 2) {
            map.put(n, 2);
        } else {
            map.put(n, sum(n - 1, map) + sum(n - 2, map));
        }
        return map.get(n);
    }

    public static void main(String[] args) {

        long l = System.currentTimeMillis();
        System.out.println(climbStairs(54));
        System.out.println(System.currentTimeMillis() - l);
    }
}
