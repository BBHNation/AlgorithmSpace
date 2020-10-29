# 剑指 Offer 68 - II. 二叉树的最近公共祖先
给定一个**二叉树**, 找到该树中两个指定节点的最近公共祖先。

百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”

例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]

## 解题思路
**递归解析：**
1. 终止条件：
* 当越过叶节点，则直接返回 nullnull ；
* 当 rootroot 等于 p, qp,q ，则直接返回 rootroot ；
2. 递推工作：
* 开启递归左子节点，返回值记为 leftleft ；
*开启递归右子节点，返回值记为 rightright ；
3. 返回值： 根据 leftleft 和 rightright ，可展开为四种情况；
* 当 leftleft 和 rightright 同时为空 ：说明 rootroot 的左 / 右子树中都不包含 p,qp,q ，返回 nullnull ；
* 当 leftleft 和 rightright 同时不为空 ：说明 p, qp,q 分列在 rootroot 的 异侧 （分别在 左 / 右子树），因此 rootroot 为最近公共祖先，返回 rootroot ；
* 当 leftleft 为空 ，rightright 不为空 ：p,qp,q 都不在 rootroot 的左子树中，直接返回 rightright 。

    具体可分为两种情况：
    * p,qp,q 其中一个在 rootroot 的 右子树 中，此时 rightright 指向 pp（假设为 pp ）；
    * p,qp,q 两节点都在 rootroot 的 右子树 中，此时的 rightright 指向 最近公共祖先节点 ；
* 当 leftleft 不为空 ， rightright 为空 ：与情况 3. 同理；

