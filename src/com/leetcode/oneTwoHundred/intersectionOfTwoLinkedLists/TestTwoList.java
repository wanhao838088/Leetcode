package com.leetcode.oneTwoHundred.intersectionOfTwoLinkedLists;

/**
 * Created by LiuLiHao on 2019/6/3 0003 上午 10:36
 * @author : LiuLiHao
 * 描述：
 *编写一个程序，找到两个单链表相交的起始节点。
 *
 * 如下面的两个链表：
 *
 * 在节点 c1 开始相交。
 */
public class TestTwoList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode c1 = new ListNode(3);
        ListNode c2 = new ListNode(4);
        ListNode c3 = new ListNode(5);

//        a1.next = a2;
//        a2.next = c1;
//        c1.next = c2;
//        c2.next = c3;

        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(2);
        ListNode b3 = new ListNode(3);

//        b1.next = b2;
//        b2.next = b3;
//        b3.next = c1;

        ListNode node = getIntersectionNode(a1, b1);
        if (node==null){
            System.out.println("null");
        }else {
            System.out.println(node.val);
        }
    }


    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null || headB==null){
            return null;
        }
        //先计算每个链表长度
        ListNode cpA = headA;
        ListNode cpB = headB;

        int lenA = 0;
        while (headA!=null){
            lenA++;
            headA = headA.next;
        }
        int lenB = 0;
        while (headB!=null){
            lenB++;
            headB = headB.next;
        }
        //根据长度差 进行循环 抵消长度差
        int temp = lenA - lenB;
        if (temp>0){
            while (temp>0){
                cpA = cpA.next;
                temp--;
            }
        }else {
            while (temp<0){
                cpB = cpB.next;
                temp++;
            }
        }
        //同时开始遍历  到了相等的地方返回
        while (cpA!=null || cpB!=null){
            if (cpA==cpB){
                return cpA;
            }
            //往下
            cpA = cpA.next;
            cpB = cpB.next;
        }

        return null;
    }
}
