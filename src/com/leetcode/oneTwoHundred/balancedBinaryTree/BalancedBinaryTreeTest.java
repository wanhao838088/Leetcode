package com.leetcode.oneTwoHundred.balancedBinaryTree;

/**
 * Created by LiuLiHao on 2019/7/12 0012 下午 04:31
 * @author : LiuLiHao
 * 描述：
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 *
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回 false 。
 *
 */
public class BalancedBinaryTreeTest {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(9);
        TreeNode root2 = new TreeNode(20);
        TreeNode root3 = new TreeNode(15);

        root.left = root1;
        root.right = root2;
        root2.left = root3;
        System.out.println(isBalanced(root));

    }

    public static boolean isBalanced(TreeNode root) {
        if (root!=null){
            //左边
            int left = getHeight(root.left);
            //右边
            int right = getHeight(root.right);
            if (Math.abs(left-right)>1){
                return false;
            }

            //一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
            return isBalanced(root.left) && isBalanced(root.right);
        }else {
            return true;
        }
    }

    /**
     * 获取高度
     */
    private static int getHeight(TreeNode node) {
        if (node==null){
            return 0;
        }
        return Math.max(node.left==null?0:getHeight(node.left),
                node.right==null?0:getHeight(node.right))+1;
    }


}
