package com.eamon.leetcode.easy;

import java.util.Stack;

/**
 * @author: eamonliu
 * @date: 2021/11/23 17:30
 * <p>
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || c != stack.pop()) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[}]"));
    }
}
