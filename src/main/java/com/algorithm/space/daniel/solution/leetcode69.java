package com.algorithm.space.daniel.solution;

public class leetcode69 {
    public int mySqrt_int(int x) {
        int l = 0, r = x, ans = -1;
        while(l <= r){
            int mid = l + (r - l)/2;
            if((long) mid * mid <= x){
                r = mid - 1;
                ans = mid;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }

    public float mySqrt_float(float x) {
        float l = 0, ans = -1;
        float r = x < 1 ? 1 : x;
        while(l <= r){
            float mid = l + (r - l)/2;
            if( Math.abs(mid * mid- x) <= 0.00001){
                r = mid - 1;
                ans = mid;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }

}
