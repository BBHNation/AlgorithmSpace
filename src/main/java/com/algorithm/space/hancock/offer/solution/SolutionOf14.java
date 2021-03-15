package com.algorithm.space.hancock.offer.solution;

import java.util.HashMap;
import java.util.Map;

public class SolutionOf14 {

    private final Map<Integer, Integer> cuttingRopeCache = new HashMap<>();

    public int cuttingRope(int n) {
        if (n == 2) {
            return 1;
        }
        if (cuttingRopeCache.containsKey(n)) {
            return cuttingRopeCache.get(n);
        }

        int result = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            // 状态转移方程 F(n) = max(i*(n-i), F(n-i))
            result = Math.max(result, Math.max((n - i) * i, cuttingRope(n - i) * i));
        }

        cuttingRopeCache.put(n, result);

        return result;
    }
}
