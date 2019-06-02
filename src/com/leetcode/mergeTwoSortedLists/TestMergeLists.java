package com.leetcode.mergeTwoSortedLists;

/**
 * Created by LiuLiHao on 2019/6/2 0002 上午 11:03
 * @author : LiuLiHao
 * 描述：
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class TestMergeLists {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode result1 = new ListNode(1);
        ListNode result2 = new ListNode(2);
        ListNode result4 = new ListNode(4);

        result1.next = result2;
        result2.next = result4;

        ListNode result11 = new ListNode(1);
        ListNode result33 = new ListNode(3);
        ListNode result44 = new ListNode(4);
        result11.next = result33;
        result33.next = result44;
        //合并
        ListNode listNode = mergeTwoLists(result1, result11);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode  = listNode.next;
        }

    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //开辟新空间 把之后比较的元素 放在后面
        ListNode head = new ListNode(0);

        ListNode pos  = head;

        while (l1!=null && l2!=null){
            if (l1.val<l2.val){
                pos.next = l1;
                pos = pos.next;
                l1 = l1.next;
            }else {
                pos.next = l2;
                pos = pos.next;
                l2 = l2.next;
            }
        }
        if (l1==null){
            pos.next = l2;
        }else {
            pos.next = l1;
        }
        return head.next;
    }

}
