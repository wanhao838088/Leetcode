package com.leetcode.twoThreeHundred;

/**
 * Created by LiuLiHao on 2019/12/2 0002 下午 04:00
 * @author : LiuLiHao
 * 描述：
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 */
public class LowestCommon235 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val<root.val && q.val<root.val){
            //在左边
            return lowestCommonAncestor(root.left,p,q);
        }else if(p.val>root.val && q.val>root.val){
            //在右边
            return lowestCommonAncestor(root.right,p,q);
        }else {
            //是自己
            return root;
        }
    }
}
