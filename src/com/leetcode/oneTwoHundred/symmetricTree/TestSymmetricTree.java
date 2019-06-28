package com.leetcode.oneTwoHundred.symmetricTree;

/**
 * Created by LiuLiHao on 2019/5/29 0029 下午 05:24
 * @author : LiuLiHao
 * 描述：
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 */
public class TestSymmetricTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root) {
        return isEq(root,root);
    }

    /**
     * 判断节点是否相同
     * @param left
     * @param right
     * @return
     */
    private static boolean isEq(TreeNode left, TreeNode right) {
        if (left==null){
            return right==null;
        }else if(right==null){
            return left==null;
        }else if(left.val==right.val){
            return isEq(left.left,right.right) && isEq(left.right,right.left);
        }else {
            return false;
        }
    }


}
