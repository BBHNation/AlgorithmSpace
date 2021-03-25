package com.algorithm.space.hancock.all.solution;

import com.algorithm.space.hancock.common.ListNode;

public class SolutionOf0092 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;

        for (int i = 0; i < left - 1; i++) pre = pre.next;

        ListNode cur = pre.next;
        ListNode next;
        for (int i = 0; i < right - left; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }

        return dummyHead.next;
    }
}
