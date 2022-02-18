package com.eamon.leetcode.easy;

import com.eamon.leetcode.ListNode;

/**
 * @author: eamonliu
 * @date: 2021/11/25 18:22
 * <p>
 */
public class RemoveDuplicatesSortedList {


    public static ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        while (head != null) {
            int val = head.val;
            ListNode next = head.next;
            if (next == null) {
                break;
            }
            if (next.val == val) {
                head.next = next.next;
                next.next = null;
            } else {
                head = head.next;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(1)))));
    }

}
