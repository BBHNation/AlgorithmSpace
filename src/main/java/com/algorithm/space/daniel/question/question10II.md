# 剑指 Offer 10 - II. 青蛙跳台阶问题
一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。

答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
```
示例 1：

输入：n = 2
输出：2
示例 2：
```
```
输入：n = 7
输出：21
示例 3：

输入：n = 0
输出：1
提示：
```
0 <= n <= 100

## 思路
标签：动态规划
本问题其实常规解法可以分成多个子问题，爬第n阶楼梯的方法数量，等于 2 部分之和

* 爬上 n-1n−1 阶楼梯的方法数量。因为再爬1阶就能到第n阶
* 爬上 n-2n−2 阶楼梯的方法数量，因为再爬2阶就能到第n阶
* 所以我们得到公式 dp[n] = dp[n-1] + dp[n-2]dp[n]=dp[n−1]+dp[n−2]
* 同时需要初始化 dp[0]=1dp[0]=1 和 dp[1]=1dp[1]=1

时间复杂度：O(n)O(n)
