## 剑指 Offer 30. 包含min函数的栈
定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。

```
示例:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.min();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.min();   --> 返回 -2.
```

```
提示：

各函数的调用总次数不超过 20000 次
```

## 思路
1. 使用额外的一个最小值站，push时候，如果比当前最小值栈的栈顶小，则push到最小值栈中
2. 临时存储一个最小值，当push时小于这个最小值，则先push当前最小值，再push入参，pop时候如果是等于当前最小值，则需要pop两次
