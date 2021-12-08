package com.eamon.leetcode.medium;

import lombok.Data;

/**
 * @author: eamonliu
 * @date: 2021/11/11 11:16
 * <p>
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {

    /**
     * 解题思路：
     * 1、初始化一个空链表，用于存储计算后的数据
     * 2、将l1和l2，头节点相加，结果分别与10做取模和除
     * 3、得到的商存入初始化的头节点，得到的余数参与下一个节点的计算
     * 4、直到商、l1，l2为空为止
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode nextNode = root;
        int mod = 0;
        while (l1 != null || l2 != null || mod != 0) {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l1.val;
            int sum = a + b + mod;

            mod = sum / 10;
            ListNode modNode = new ListNode(sum % 10);
            nextNode.next = modNode;
            nextNode = modNode;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return root.next;
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

    public static void main(String[] args) {
        ListNode l1 = new ListNode(7, new ListNode(6, new ListNode(5)));
        ListNode l2 = new ListNode(6, new ListNode(5, new ListNode(7)));
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }
}
