package com.leetcode.zeroToTwoHundred;

/**
 * Created by LiuLiHao on 2020/4/26 0026 上午 10:11
 * @author : LiuLiHao
 * 描述：
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 *
 * 示例:
 *
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 *
 *
 */
public class MergeKSortedLists23 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

//        @Override
//        public String toString() {
//            StringBuilder sb = new StringBuilder();
//            while (next!=null){
//                sb.append(val +",");
//            }
//            return sb.toString();
//        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = genNode(new int[]{1, 4, 5});
        ListNode listNode2 = genNode(new int[]{1, 3, 4});
        ListNode listNode3 = genNode(new int[]{2, 6});


        ListNode listNode = mergeKLists(new ListNode[]{listNode1, listNode2, listNode3});

        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public static ListNode genNode(int[] vals) {
        ListNode ans = new ListNode(0);
        ListNode copy = ans;
        for (int integer : vals) {
            ans.next = new ListNode(integer);
            ans = ans.next;
        }
        return copy.next;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        } else if (lists.length == 1) {
            return lists[0];
        } else if (lists.length == 2) {
            return mergeTwoLists(lists[0], lists[1]);
        }
        int mid = lists.length / 2;
        ListNode[] left = new ListNode[mid];
        for (int i = 0; i < mid; i++) {
            left[i] = lists[i];
        }

        ListNode[] right = new ListNode[lists.length - mid];
        for (int i = mid, j = 0; i < lists.length; i++, j++) {
            right[j] = lists[i];
        }
        return mergeTwoLists(mergeKLists(left), mergeKLists(right));
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode head = null;
        if (list1.val <= list2.val) {
            head = list1;
            head.next = mergeTwoLists(list1.next, list2);
        } else {
            head = list2;
            head.next = mergeTwoLists(list1, list2.next);
        }
        return head;
    }

//    public static ListNode mergeKLists(ListNode[] lists) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (ListNode node : lists) {
//            while (node!=null){
//                linkedList.add(node.val);
//                node = node.next;
//            }
//        }
//        Collections.sort(linkedList);
//        ListNode ans = new ListNode(0);
//        ListNode copy = ans;
//        for (Integer integer : linkedList) {
//            ans.next = new ListNode(integer);
//            ans = ans.next;
//        }
//        return copy.next;
//    }
}
