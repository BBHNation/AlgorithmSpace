package com.algorithm.space.hancock.all.solution;

import com.algorithm.space.hancock.common.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf0092Test {
    @Test
    void reverseBetween_shouldReturn14325_given12345Left2Right4() {
        // given
        ListNode list = createList(1, 2, 3, 4, 5);
        int left = 2;
        int right = 4;

        // when
        ListNode reversed = new SolutionOf0092().reverseBetween(list, left, right);

        // then
        Assertions.assertThat(reversed.equalTo(createList(1, 4, 3, 2, 5))).isTrue();
    }

    private ListNode createList(int... values) {
        ListNode head = new ListNode(0);
        ListNode pointer = head;
        for (int value : values) {
            pointer.next = new ListNode(value);
            pointer = pointer.next;
        }
        return head.next;
    }
}