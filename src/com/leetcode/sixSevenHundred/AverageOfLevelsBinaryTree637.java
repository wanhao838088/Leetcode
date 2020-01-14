package com.leetcode.sixSevenHundred;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by LiuLiHao on 2020/1/14 0014 上午 10:50
 * @author : LiuLiHao
 * 描述：
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
 *
 * 示例 1:
 *
 * 输入:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 输出: [3, 14.5, 11]
 * 解释:
 * 第0层的平均值是 3,  第1层是 14.5, 第2层是 11. 因此返回 [3, 14.5, 11].
 *
 */
public class AverageOfLevelsBinaryTree637 {

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
        root.left = node1;
        root.right = node2;
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        node2.left = node3;
        node2.right = node4;

        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(5);
        node1.left = node5;
        node1.right = node6;

        List<Double> list = averageOfLevels(root);
        System.out.println(list);
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        List<Double> list = new LinkedList<>();
        if (root==null){
            return list;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            double sum = 0.0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
                sum+=node.val;
            }
            list.add(sum / size);
        }
        return list;
    }

}
