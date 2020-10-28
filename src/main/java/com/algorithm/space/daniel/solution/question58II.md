

# 左旋转字符串

字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

```
示例 1：

输入: s = "abcdefg", k = 2
输出: "cdefgab"
示例 2：

输入: s = "lrloseumgh", k = 6
输出: "umghlrlose"
```

限制：

1 <= k < s.length <= 10000

 ## Code

```java
class Solution {
    public String reverseLeftWords(String s, int n) {
      StringBuilder res = new StringBuilder();
        for(int i = n; i < s.length(); i++){
            res.append(s.charAt(i));
        }
        for(int i = 0; i < n; i++){
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}
```

## Note

使用String的话也可以得到结果`res+=s.charAt(i)`，但是会大大增加计算时间，因为String是不可变对象，每次遍历拼接需要重新开辟空间，并且还是会用StringBuilder来完成拼接（+=是通过StringBuilder实现的），所以直接使用StringBuilder。

