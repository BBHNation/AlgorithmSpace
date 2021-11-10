package com.algorithm.space.hancock.common;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

    private final Map<Integer, Node> map;

    private final Node head;

    private final Node tail;

    private final int capacity;

    private int count;

    {
        map = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.pre = head;
        count = 0;
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            moveToLatest(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            map.put(key, node);
            moveToLatest(node);
            return;
        }

        if (count >= capacity) {
            Node headNext = head.next;
            head.next = headNext.next;
            headNext.next.pre = head;
            map.remove(headNext.key);
            count--;
        }
        Node node = new Node(key, value);
        Node tailPre = tail.pre;
        node.next = tail;
        node.pre = tailPre;
        tail.pre = node;
        tailPre.next = node;
        map.put(key, node);
        count++;
    }

    private void moveToLatest(Node node) {
        Node pre = node.pre;
        Node next = node.next;
        pre.next = next;
        next.pre = pre;

        Node tailPre = tail.pre;
        node.pre = tailPre;
        node.next = tail;
        tailPre.next = node;
        tail.pre = node;
    }

    private final class Node {
        int key;

        int value;

        Node pre;

        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        Node() {
        }
    }
}