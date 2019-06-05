package com.leetcode.oneTwoHundred.linkedListCycleComments;

/**
 * Created by LiuLiHao on 2019/6/3 0003 上午 10:14
 * @author : LiuLiHao
 * 描述：
 * 给定一个链表，判断链表中是否有环。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：true
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 */
public class TestCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
          val = x;
          next = null;
        }
    }

    public static void main(String[] args) {

    }

    /**
     * 使用快慢指针
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head) {
        if (head==null || head.next==null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            //快指针一次走2步
            fast = fast.next.next;
            //慢指针一次走1步
            slow = slow.next;

            if (slow==fast){
                return true;
            }
        }
        return false;
    }
}
