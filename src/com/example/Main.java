package com.example;

public class Main {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(7);
        a.next = b;
        b.next = c;
        System.out.println(a);
        ListNode a2 = new ListNode(2);
        ListNode b2 = new ListNode(12);

        a2.next = b2;

        System.out.println(a2);
        System.out.println(mergeTwoLists(a, a2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sortedMergedList;
        ListNode head;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            sortedMergedList = l1;
            l1 = l1.next;
        } else {
            sortedMergedList = l2;
            l2 = l2.next;
        }
        head = sortedMergedList;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                sortedMergedList.next = l1;
                sortedMergedList = sortedMergedList.next;
                l1 = l1.next;
            } else {
                sortedMergedList.next = l2;
                sortedMergedList = sortedMergedList.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            sortedMergedList.next = l2;
            return head;
        }
        if (l2 == null) {
            sortedMergedList.next = l1;
            return head;
        }
        return head;
    }
}
