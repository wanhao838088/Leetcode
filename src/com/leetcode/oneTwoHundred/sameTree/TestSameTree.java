package com.leetcode.oneTwoHundred.sameTree;

/**
 * Created by LiuLiHao on 2019/5/29 0029 下午 04:45
 * @author : LiuLiHao
 * 描述：
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 * 示例 1:
 *
 * 输入:       1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * 输出: true
 * 示例 2:
 *
 * 输入:      1          1
 *           /           \
 *          2             2
 *
 *         [1,2],     [1,null,2]
 *
 * 输出: false
 * 示例 3:
 *
 * 输入:       1         1
 *           / \       / \
 *          2   1     1   2
 *
 *         [1,2,1],   [1,1,2]
 *
 * 输出: false
 */
public class TestSameTree {
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

        boolean sameTree = isSameTree(treeNode1, treeNode1);
        System.out.println(sameTree);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null){
            return true;
        }else if(p==null && q!=null){
            return false;
        }else if(q==null && p!=null){
            return false;
        }

        if (p.val==q.val){
            boolean b1;
            if (p.left!=null && q.left!=null){
                b1 = isSameTree(p.left, q.left);
            }else if(p.left==null && q.left!=null){
                b1 = false;
            }else if (p.left==null && q.left==null){
                b1 = true;
            }else {
                b1 = false;
            }
            boolean b2;
            if (p.right!=null && q.right!=null){
                b2 = isSameTree(p.right, q.right);
            }else if(p.right==null && q.right!=null){
                b2 = false;
            }else if (p.right==null && q.right==null){
                b2 = true;
            }else {
                b2 = false;
            }

            return b1 && b2;
        }else {
            return false;
        }
    }
}
