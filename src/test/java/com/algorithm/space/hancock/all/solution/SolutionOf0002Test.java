package com.algorithm.space.hancock.all.solution;

import com.algorithm.space.hancock.common.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf0002Test {
    @Test
    void addTwoNumbers_shouldReturn807_given342Add564() {
        // given
        ListNode l1 = generateList(3, 4, 2);
        ListNode l2 = generateList(4, 6, 5);

        // when
        ListNode result = new SolutionOf0002().addTwoNumbers(l1, l2);

        // then
        assertIsEqual(result, generateList(8, 0, 7));
    }

    private ListNode generateList(int... values) {
        ListNode head = new ListNode(0);
        ListNode pointer = head;
        for (int index = values.length - 1; index >= 0; index--) {
            pointer.next = new ListNode(values[index]);
            pointer = pointer.next;
        }
        return head.next;
    }

    private void assertIsEqual(ListNode l1, ListNode l2) {
        System.out.println(printList(l1));
        System.out.println(printList(l2));

        while (l1 != null && l2 != null) {
            Assertions.assertThat(l1.val).isEqualTo(l2.val);
            l1 = l1.next;
            l2 = l2.next;
        }
        Assertions.assertThat(l1).isNull();
        Assertions.assertThat(l2).isNull();
    }

    private String printList(ListNode listNode) {
        ListNode head = listNode;
        StringBuilder stringBuilder = new StringBuilder();
        while (head != null) {
            stringBuilder.append(head.val);
            head = head.next;
        }
        return stringBuilder.toString();
    }
}