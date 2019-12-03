package com.leetcode.twoThreeHundred.binaryTreePaths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LiuLiHao on 2019/6/10 0010 下午 04:09
 * @author : LiuLiHao
 * 描述：
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 *
 */
public class TestBinaryTreePaths {

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
        TreeNode treeNode5 = new TreeNode(5);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode5;

        List<String> list = binaryTreePaths(treeNode1);
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root==null){
            return list;
        }
        binaryTreePaths(root,"",list);

        return list;
    }

    private static void binaryTreePaths(TreeNode root, String cur, List<String> list) {
        if (root==null){
            return;
        }
        cur += root.val;
        if (root.left==null && root.right==null){
            list.add(cur);
        }else {
            binaryTreePaths(root.left,cur+"->",list);
            binaryTreePaths(root.right,cur+"->",list);
        }
    }


}
