package com.leetcode.zeroToTwoHundred.removeNthNodeFromEnd;

/**
 * Created by LiuLiHao on 2019/7/30 0030 下午 03:12
 * @author : LiuLiHao
 * 描述：
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 */
public class RemoveTest {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode cp1 = node;
        for (int i = 2; i < 6; i++) {
            ListNode node2 = new ListNode(i);
            node.next = node2;
            node = node.next;
        }

        ListNode result = removeNthFromEnd(cp1, 2);

        //遍历
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //快慢指针
        ListNode fast = head;
        ListNode slow = head;
        //快指针走n步
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        //删除第一个了
        if (fast==null){
            return head.next;
        }
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
