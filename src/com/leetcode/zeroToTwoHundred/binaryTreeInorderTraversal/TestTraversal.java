package com.leetcode.zeroToTwoHundred.binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by LiuLiHao on 2019/7/30 0030 下午 02:29
 * @author : LiuLiHao
 * 描述：
 *给定一个二叉树，返回它的中序 遍历。
 *
 * 示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,3,2]
 *
 */
public class TestTraversal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.right = node2;
        node2.left = node3;

        List<Integer> list = inorderTraversal(node1);

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root==null){
            return result;
        }
        //inorderTraversal(root,result);

        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root!=null){
            //进栈
            while (root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }

        return result;
    }

    /**
     * 递归
     * @param root
     * @param result
     */
    private void inorderTraversal(TreeNode root, List<Integer> result) {
        if (root.left!=null){
            inorderTraversal(root.left,result);
        }
        result.add(root.val);
        if (root.right!=null){
            inorderTraversal(root.right,result);
        }
    }
}
