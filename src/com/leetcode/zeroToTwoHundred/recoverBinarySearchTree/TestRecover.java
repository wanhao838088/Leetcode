package com.leetcode.zeroToTwoHundred.recoverBinarySearchTree;

import java.util.Stack;

/**
 * Created by LiuLiHao on 2019/7/19 0019 上午 11:29
 * @author : LiuLiHao
 * 描述：
 * 二叉搜索树中的两个节点被错误地交换。
 *
 * 请在不改变其结构的情况下，恢复这棵树。
 *
 * 示例 1:
 *
 * 输入: [1,3,null,null,2]
 *
 *    1
 *   /
 *  3
 *   \
 *    2
 *
 * 输出: [3,1,null,null,2]
 *
 *    3
 *   /
 *  1
 *   \
 *    2
 * 示例 2:
 *
 * 输入: [3,1,4,null,null,2]
 *
 *   3
 *  / \
 * 1   4
 *    /
 *   2
 *
 * 输出: [2,1,4,null,null,3]
 *
 *   2
 *  / \
 * 1   4
 *    /
 *   3
 */
public class TestRecover {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public void recoverTree(TreeNode root) {

        if (root==null){
            return;
        }
        TreeNode cur = root,pre = null,wrong = null;

        //使用中序遍历方式
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || cur!=null){
            if (cur!=null){
                //入栈
                stack.add(cur);
                cur = cur.left;
            }else {
                //出栈
                cur = stack.pop();
                //找到第一个错误元素
                if (wrong==null && pre!=null && cur.val < pre.val){
                    wrong = pre;
                }
                //找到第二个错误元素
                if (wrong!=null && cur.val>wrong.val){
                    //交换
                    swap(wrong,pre);
                    break;
                }
                pre = cur;
                cur = cur.right;
            }

        }
        //判断最后一个
        if (wrong!=null && wrong.val>pre.val){
            swap(wrong,pre);
        }
    }

    private void swap(TreeNode n1,TreeNode n2){
        int temp = n1.val;
        n1.val = n2.val;
        n2.val = temp;
    }

}
