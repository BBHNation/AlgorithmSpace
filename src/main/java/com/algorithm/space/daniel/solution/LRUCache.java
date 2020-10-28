package com.algorithm.space.daniel.solution;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
    private int capacity;
    private HashMap<Integer, Node> map;
    private LinkedList<Node> cache;
    class Node {
        public int key, val;
        public Node next, prev;
        public Node(int k, int v) {
            this.key = k;
            this.val = v;
        }
    }
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap();
        cache = new LinkedList();
    }

    public int get(int key) {
        //如果已经不存在 则返回-1
        if(!map.containsKey(key)){
            return -1;
        }
        //如果已经存在
        int value = map.get(key).val;
        //更新节点的位置
        put(key, value);
        return value;
    }

    public void put(int key, int value) {
        Node n = new Node(key, value);
        //如果已经存在，则移除链表中为key的节点，重新加入到链表首部
        if(map.containsKey(key)){
            cache.remove(map.get(key));
            cache.addFirst(n);
            //更新map中对应节点的数据
            map.put(key, n);
        }else{
            //如果链表已满，则移除链表最后一个节点
            if(cache.size() == capacity){
                Node last = cache.removeLast();
                map.remove(last.key);
            }
            //添加到链表首部
            cache.addFirst(n);
            //更新map
            map.put(key, n);
        }
    }
}
