package com.algorithm.space.hancock.solution;

public class SolutionOf16 {
    public double myPow(double x, int n) {
        double result = 1;
        if (x == 0) {
            return 0;
        }

        long b = n;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }

        while (b > 0) {
            if ((b & 1) == 1) {
                result *= x; // 最后一次都是1
            }
            x *= x; // 偶数时候，是平方处理
            b >>= 1;
        }

        return result;
    }
}
