package com.eamon.leetcode.easy;

import lombok.Data;

/**
 * @author: eamonliu
 * @date: 2021/11/23 17:45
 */
public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        ListNode cur = resultNode;

        while (l1 != null && l2 != null) {
            int l1val = l1.val;
            int l2val = l2.val;
            if (l1val < l2val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return resultNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(2, new ListNode(3, new ListNode(5)));
        System.out.println(mergeTwoLists(l1, l2));

    }

    @Data
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
