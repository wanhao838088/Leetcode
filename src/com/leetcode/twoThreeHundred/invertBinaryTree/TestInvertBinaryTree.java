package com.leetcode.twoThreeHundred.invertBinaryTree;

/**
 * Created by LiuLiHao on 2019/6/7 0007 下午 09:40
 * @author : LiuLiHao
 * 描述：
 *
 *翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 *
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 */
public class TestInvertBinaryTree {

      static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(9);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        TreeNode treeNode = invertTree(node1);
        System.out.println(treeNode);
    }

    public static TreeNode invertTree(TreeNode root) {

        if (root==null){
            return null;
        }
        TreeNode copy = root;
        //左右交换位置
        if (root.left!=null || root.right!=null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return copy;
    }
}
