package com.leetcode.removeDuplicates;

/**
 * Created by LiuLiHao on 2019/5/29 0029 下午 02:52
 *
 * @author : LiuLiHao
 * 描述：
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class TestRemoveDuplicates {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(1);


        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        deleteDuplicates(listNode);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode node = head;
        while (node != null) {
            if (node.next!=null && node.val == node.next.val) {
                node.next = node.next.next;
                continue;
            }
            node = node.next;
        }
        return head;
    }
}
