package com.algorithm.space.daniel.solution;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class Solution35 {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<Node, Node>();
        Node cur = head;
        while(cur != null){
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}