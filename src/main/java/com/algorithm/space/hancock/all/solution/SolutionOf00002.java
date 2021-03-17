package com.algorithm.space.hancock.all.solution;

import com.algorithm.space.hancock.common.ListNode;

public class SolutionOf00002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0; // 进位
        ListNode head = new ListNode(0); // 结果变量
        ListNode pointer = head;

        while (l1 != null || l2 != null || carry > 0) {
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            int value = num1 + num2 + carry;

            carry = value / 10;
            value %= 10;

            if (head.next == null) {
                head.next = new ListNode(value);
                pointer = head.next;
            } else {
                pointer.next = new ListNode(value);
                pointer = pointer.next;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {
            pointer.next = new ListNode(carry);
        }

        return head.next;
    }
}
