package com.leetcode.oneTwoHundred;

/**
 * Created by LiuLiHao on 2020/5/26 0026 下午 04:01
 * @author : LiuLiHao
 * 描述：
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 * 说明：不允许修改给定的链表。
 *
 */
public class LinkedListCycle142 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(4);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;
        ListNode listNode = detectCycle(listNode1);
        System.out.println(listNode.val);
    }
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode bak = head;

        boolean flag = false;
        while (slow!=null && fast!=null && fast.next!=null&& fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow.val == fast.val){
                flag = true;
                break;
            }
        }
        if (flag){
            while (bak.val!=fast.val){
                bak = bak.next;
                fast = fast.next;
            }
            return fast;
        }
        return null;
    }


}
