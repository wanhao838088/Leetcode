package com.leetcode.twelveToThirteen;

/**
 * Created by LiuLiHao on 2019/12/16 0016 下午 03:39
 * @author : LiuLiHao
 * 描述：
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 *
 * 请你返回该链表所表示数字的 十进制值 。
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：head = [1,0,1]
 * 输出：5
 * 解释：二进制数 (101) 转化为十进制数 (5)
 * 示例 2：
 *
 * 输入：head = [0]
 * 输出：0
 * 示例 3：
 *
 * 输入：head = [1]
 * 输出：1
 * 示例 4：
 *
 * 输入：head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
 * 输出：18880
 * 示例 5：
 *
 * 输入：head = [0,0]
 * 输出：0
 *
 */
public class ConvertBinaryNumberInLinkedList1290 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        System.out.println(getDecimalValue(listNode1));
    }

    public static int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head!=null){
            sb.append(head.val);
            head = head.next;
        }
        return Integer.valueOf(sb.toString(),2);
    }
}
