package com.algorithm.space.daniel.solution;

public class Solution58 {
    public String reverseWords(String s) {
        String tmp = s.trim();
        //使用双指针定位单词
        int start = tmp.length() - 1;
        int end = tmp.length() - 1;
        String res = "";
        while(start >= 0){
            //两个从后遍历，找出一个单词的索引位置
            while(start >= 0 && tmp.charAt(start) != ' '){
                start--;
            }
            //将单词添加到res中并加上空格
            //注意substring取得是[start，end）左闭右开
            res += tmp.substring(start + 1, end + 1) + " ";
            //将start和end定位到下一个单词的末尾
            while(start >= 0 && tmp.charAt(start) == ' '){
                start--;
            }
            end = start;
        }
        //删除结果字符串两端的空格
        return res.trim();
    }
}
