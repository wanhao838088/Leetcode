package com.leetcode.twoThreeHundred.removeLinkedListElements;

/**
 * Created by LiuLiHao on 2019/6/5 0005 上午 11:30
 * @author : LiuLiHao
 * 描述：
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class TestRemove {

      static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode listNode = removeElements(listNode1, 15);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public static ListNode removeElements(ListNode head, int val) {
        //备份起点
        ListNode copy =  head;

        while (copy!=null){
            //判断下面的节点是否重复
            if (copy.next!=null && copy.next.val==val){
                copy.next = copy.next.next;
                continue;
            }else if(copy.val==val){
                //开头节点重复
                head = head.next;
            }
            copy = copy.next;
        }

        return head;
    }

}
