package com.eamon.leetcode.easy;

import com.eamon.leetcode.TreeNode;

import java.util.*;

/**
 * @author: eamonliu
 * @date: 2021/11/29 15:24
 * <p>
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
public class BinaryTreeTraversal {

    /**
     * 广度优先
     * 一层一层遍历 BFS
     *
     * @param root
     * @return
     */
    public static List<Integer> guangduyouxian(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode left = node.left;
            if (left != null) {
                queue.offer(left);
            }
            TreeNode right = node.right;
            if (right != null) {
                queue.offer(right);
            }
            result.add(node.val);
        }
        return result;
    }

    /**
     * 中序遍历
     * 左-中-右
     *
     * @param root
     * @return
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                result.add(root.val);
                root = root.right;
            }
        }


        return result;
    }

    /**
     * 中-左-右
     * 前序遍历
     *
     * @param root
     * @return
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4,
                new TreeNode(5, new TreeNode(7), new TreeNode(8)),
                new TreeNode(6, new TreeNode(9), new TreeNode(10)));
        System.out.println("前序遍历result：" + preorderTraversal(treeNode));
        System.out.println("中遍历result：" + inorderTraversal(treeNode));
        System.out.println("广度优先遍历result：" + guangduyouxian(treeNode));

    }


}
