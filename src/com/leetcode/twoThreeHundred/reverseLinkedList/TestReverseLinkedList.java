package com.leetcode.twoThreeHundred.reverseLinkedList;

import java.util.LinkedList;

/**
 * Created by LiuLiHao on 2019/6/5 0005 下午 04:54
 * @author : LiuLiHao
 * 描述：
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class TestReverseLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode1.next  = listNode2;
        listNode2.next  = listNode3;
        listNode3.next  = listNode4;
        ListNode node = reverseList(listNode1);

        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }

    }

    /**
     * 反转链表
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        if (head==null){
            return null;
        }
        LinkedList<ListNode> list = new LinkedList<>();

        while (head!=null){
            //最后得元素放到最前面
            list.addFirst(head);
            head = head.next;
        }

        ListNode result = new ListNode(list.removeFirst().val);
        //保存一份引用 返回出去
        ListNode cp =result;

        //取出元素
        while (!list.isEmpty()){
            result.next = new ListNode(list.removeFirst().val);
            result = result.next;
        }

        return cp;
    }
}
