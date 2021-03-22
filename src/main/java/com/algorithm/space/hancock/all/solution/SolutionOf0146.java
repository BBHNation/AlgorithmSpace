package com.algorithm.space.hancock.all.solution;

import java.util.LinkedHashMap;
import java.util.Map;

public class SolutionOf0146 extends LinkedHashMap<Integer, Integer> {
    private final int capacity;

    public SolutionOf0146(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
