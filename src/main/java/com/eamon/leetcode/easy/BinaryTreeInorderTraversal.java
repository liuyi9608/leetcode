package com.eamon.leetcode.easy;

import com.eamon.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: eamonliu
 * @date: 2021/11/29 15:24
 * <p>
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
public class BinaryTreeInorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        binary(root, result);
        return result;
    }

    public static List<Integer> inorderTraversalTwo(TreeNode root) {
        List<Integer> result = new ArrayList<>();
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

    public static void binary(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        binary(node.left, list);

        binary(node.right, list);

        list.add(node.val);


    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4,
                new TreeNode(5, new TreeNode(7), new TreeNode(8)),
                new TreeNode(6, new TreeNode(9), new TreeNode(10)));
        System.out.println(inorderTraversalTwo(treeNode));
    }


}
