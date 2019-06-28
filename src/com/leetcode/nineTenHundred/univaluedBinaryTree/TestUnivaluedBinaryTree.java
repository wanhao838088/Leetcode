package com.leetcode.nineTenHundred.univaluedBinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

/**
 * Created by LiuLiHao on 2019/6/28 0028 下午 04:23
 * @author : LiuLiHao
 * 描述：
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 *
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：[1,1,1,1,1,null,1]
 * 输出：true
 * 示例 2：
 *
 *
 *
 * 输入：[2,2,2,5,2]
 * 输出：false
 *
 */
public class TestUnivaluedBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }

    public boolean isUnivalTree(TreeNode root) {
        TreeSet<Integer> set = new TreeSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //使用层次进行遍历
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
                set.add(node.val);
                if (set.size()>1){
                    return false;
                }
            }
        }
        return set.size()==1;
    }
}
