package com.leetcode.maximumDepthOfBinaryTree;


/**
 * Created by LiuLiHao on 2019/5/30 0030 下午 08:18
 * @author : LiuLiHao
 * 描述：
 *
 */
public class TestBinaryTree {

    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        int i = maxDepth(treeNode1);
        System.out.println(i);
    }

    public static int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left,right)+1;
        }
    }
}
