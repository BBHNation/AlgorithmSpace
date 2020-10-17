# 剑指 Offer 35. 复杂链表的复制
实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。


## 思路
* 遍历链表各节点，使用hashmap复制节点
* 再次遍历链表各节点，复制每个节点的next和random