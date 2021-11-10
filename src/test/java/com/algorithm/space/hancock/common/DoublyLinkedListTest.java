package com.algorithm.space.hancock.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.algorithm.space.hancock.common.DoublyLinkedList.DoublyListNode;

class DoublyLinkedListTest {
    @Test
    void shouldNodeAtLastWhenAddOneNodeToLastGivenOneNode() {
        // given
        DoublyLinkedList linkedList = new DoublyLinkedList(3);

        // when
        linkedList.add(1);
        linkedList.add(2);

        // then
        int val = linkedList.getForIndex(1).val;
        Assertions.assertEquals(2, val);
    }

    @Test
    void shouldNodeMoveToLastWhenCallingPutNodeToLastGivenOneExitNode() {
        // given
        DoublyLinkedList linkedList = new DoublyLinkedList(3);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        DoublyListNode eldestNode = linkedList.getForIndex(0); // should be 1

        // when
        linkedList.putToLatest(eldestNode);

        // then
        DoublyListNode latestNode = linkedList.getLatestNode();
        Assertions.assertEquals(1, latestNode.val);
    }

    @Test
    void shouldRemoveEldestNodeWhenAddNodeGivenListFull() {
        // given
        DoublyLinkedList linkedList = new DoublyLinkedList(3);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        // when
        linkedList.add(4);

        // then
        DoublyListNode node = linkedList.getForIndex(0);
        Assertions.assertEquals(2, node.val);
    }
}