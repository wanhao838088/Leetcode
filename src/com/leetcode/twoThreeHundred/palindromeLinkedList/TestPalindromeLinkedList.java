package com.leetcode.twoThreeHundred.palindromeLinkedList;

import java.util.Stack;

/**
 * Created by LiuLiHao on 2019/6/11 0011 下午 04:35
 *
 * @author : LiuLiHao
 * 描述：
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 */
public class TestPalindromeLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
//        ListNode listNode3 = new ListNode(-1);
//        ListNode listNode4 = new ListNode(-1);
//        ListNode listNode5 = new ListNode(4);
//        ListNode listNode6 = new ListNode(1);

        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        listNode5.next = listNode6;


        System.out.println(isPalindrome(listNode1));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode copy = head;
        //辅助空间
        Stack<Integer> stack = new Stack<>();
        while (copy!=null){
            stack.push(copy.val);
            copy = copy.next;
        }

        while (head!=null){
            Integer val = stack.pop();
            if (val!=head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }

}
