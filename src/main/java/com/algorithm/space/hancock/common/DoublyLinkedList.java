package com.algorithm.space.hancock.common;

public class DoublyLinkedList {

    private final DoublyListNode head;
    private final DoublyListNode tail;
    private final int totalSize;
    private int currentSize;

    {
        head = new DoublyListNode(0);
        tail = new DoublyListNode(0);
        head.next = tail;
        tail.pre = head;
        currentSize = 0;
    }

    public DoublyLinkedList(int size) {
        this.totalSize = size;
    }

    public void add(int value) {
        if (currentSize >= totalSize) {
            DoublyListNode headNext = head.next;
            head.next = headNext.next;
            headNext.next.pre = head;
            currentSize--;
        }

        DoublyListNode node = new DoublyListNode(value);
        DoublyListNode preOne = tail.pre;

        node.pre = preOne;
        node.next = tail;

        tail.pre = node;
        preOne.next = node;

        currentSize++;
    }

    public void putToLatest(DoublyListNode node) {
        DoublyListNode pre = node.pre;
        DoublyListNode next = node.next;

        pre.next = next;
        next.pre = pre;

        DoublyListNode tailPre = tail.pre;
        node.pre = tailPre;
        node.next = tail;

        tailPre.next = node;
        tail.pre = node;
    }

    public DoublyListNode getForIndex(int index) {
        if (index > totalSize) {
            return null;
        }

        DoublyListNode pointer = head;

        while (index >= 0) {
            pointer = pointer.next;
            index--;
        }

        return pointer;
    }

    public DoublyListNode getLatestNode() {
        return tail.pre == head ? null : tail.pre;
    }

    public final static class DoublyListNode {
        public DoublyListNode pre;

        public DoublyListNode next;

        public int val;

        public DoublyListNode(int x) {
            val = x;
        }
    }

}
