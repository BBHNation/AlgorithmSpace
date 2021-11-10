package com.algorithm.space.hancock.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LRUCacheTest {

    @Test
    void shouldRemoveEldestNodeWhenPutOneMoreNodeGivenCacheIsFull() {
        // given
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);
        cache.put(3, 3);

        // when
        int result = cache.get(2);

        // then
        Assertions.assertEquals(-1, result);
    }

    /*
["LRUCache","put","put","put","put","get","get"]
[[2],[2,1],[1,1],[2,3],[4,1],[1],[2]]]
     */

    @Test
    void shouldWorkWellWithCase1() {
        // given
        LRUCache cache = new LRUCache(2);
        cache.get(2);
        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        cache.put(4, 1);

        // when
        int valueOf1 = cache.get(1);
        int valueOf2 = cache.get(2);

        // then
        Assertions.assertEquals(-1, valueOf1);
        Assertions.assertEquals(3, valueOf2);
    }
}