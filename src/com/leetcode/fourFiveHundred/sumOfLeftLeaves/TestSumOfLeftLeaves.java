package com.leetcode.fourFiveHundred.sumOfLeftLeaves;

/**
 * Created by LiuLiHao on 2019/6/27 0027 下午 01:42
 * @author : LiuLiHao
 * 描述：
 * 计算给定二叉树的所有左叶子之和。
 *
 * 示例：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 *
 */
public class TestSumOfLeftLeaves {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        int sum = sumOfLeftLeaves(root);
        System.out.println(sum);
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root==null){
            return 0;
        }else if ( root.left!=null &&
                root.left.left==null &&
                root.left.right==null){
            return root.left.val+sumOfLeftLeaves(root.right);
        }else {
            //子节点都不为空  继续递归
            return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        }
    }

}
