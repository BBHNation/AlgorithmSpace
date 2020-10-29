# 剑指 Offer 66. 构建乘积数组
给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。

 
```
示例:

输入: [1,2,3,4,5]
输出: [120,60,40,30,24]
```

提示：

所有元素乘积之和不会溢出 32 位整数
a.length <= 100000

## 思路

## 整体思路：
这道题如果可以使用除法，那么就很简单了，先求出来所有数的乘积，然后再依次除掉每个对应的值即可
不让使用除法，那么最简单的思路就是将B[i]每个位置都把所有需要的数乘一遍，但是这样的时间复杂度非常高
降低时间复杂度的方式就是以A[i]为界线，分割出左右三角形，其中每个三角形从尖部到底部都是可以累积的，这样就可以减少时间复杂度（具体见画）
### 复杂度：
时间复杂度：O(n)O(n)。因为左右三角遍历求乘积的时间复杂度都是O(n)O(n)
空间复杂度：O(1)O(1)。不将结果数组算入的话，只需要常量的空间复杂度
## 算法流程
* 首先申请结果数组 res
* 求出左侧三角从上到下的值，依次存入 res[i] 中
* 求出右侧三角从下到上的值，并且和之前的 res[i] 做**乘积**存入，即可得到结果