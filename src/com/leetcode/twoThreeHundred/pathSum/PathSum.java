package com.leetcode.twoThreeHundred.pathSum;

/**
 * Created by LiuLiHao on 2019/7/30 0030 上午 11:16
 * @author : LiuLiHao
 * 描述：
 * 112. 路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例: 
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2
 *
 */
public class PathSum {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    int curSum;

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(5);

    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.val;
        //如果到了叶子节点相减等于0 返回
        if (root.left == null && root.right == null) {
            return sum == 0;
        }

        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

}
