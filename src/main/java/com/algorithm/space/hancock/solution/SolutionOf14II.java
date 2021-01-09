package com.algorithm.space.hancock.solution;

public class SolutionOf14II {

    public int cuttingRope(int n) {
        if (n == 3) {
            return 2;
        } else if (n == 2) {
            return 1;
        }

        long result = 1L;
        int mod = (int) 1e9 + 7;
        while (n > 4) {
            result = (result * 3) % mod;
            n = n - 3;
        }

        return (int)(result * n % mod);
    }
}
