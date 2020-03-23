package com.leetcode.eightNineHundred;

/**
 * Created by LiuLiHao on 2020/3/23 0023 上午 09:32
 * @author : LiuLiHao
 * 描述：
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,4,5]
 * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
 * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
 * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
 * 示例 2：
 *
 * 输入：[1,2,3,4,5,6]
 * 输出：此列表中的结点 4 (序列化形式：[4,5,6])
 * 由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
 *  
 *
 * 提示：
 *
 * 给定链表的结点数介于 1 和 100 之间。
 *
 */
public class MiddleOfTheLinkedList876 {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode copy = head;
        for (int i = 2; i < 7; i++) {
            ListNode temp = new ListNode(i);
            head.next = temp;
            head = head.next;
        }
        ListNode listNode = middleNode(copy);
        System.out.println(listNode.val);
    }

//    public static ListNode middleNode(ListNode head) {
//        ListNode copy = head;
//        int len = 0;
//        while (head!=null){
//            head = head.next;
//            len++;
//        }
//        int count = len/2;
//        while (count>0){
//            copy = copy.next;
//            count--;
//        }
//        return copy;
//    }

    public static ListNode middleNode(ListNode head) {
        ListNode quick = head,slow = head;

        while (quick!=null && quick.next!=null){
            quick = quick.next.next;
            slow = slow.next;
        }
        return slow;
    }



        static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
