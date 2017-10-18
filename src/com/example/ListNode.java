package com.example;

/**
 * Created by bsheen on 10/17/17.
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        this.val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
