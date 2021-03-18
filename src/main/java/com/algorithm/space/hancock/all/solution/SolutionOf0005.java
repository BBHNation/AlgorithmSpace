package com.algorithm.space.hancock.all.solution;

public class SolutionOf0005 {
    public String longestPalindrome(String s) {
        int begin = 0;
        int end = 0;
        /*
        中心扩展法。
        需要注意奇偶数的中心不一样。
         */
        for (int index = 0; index < s.length(); index++) {
            int len1 = lengthOfLongestPalindromeWithCenter(s, index, index); // 奇数中心
            int len2 = lengthOfLongestPalindromeWithCenter(s, index, index + 1); // 偶数中心
            int maxLength = Math.max(len1, len2);
            if (maxLength > end - begin + 1) {
                begin = index - (maxLength - 1) / 2;
                end = index + maxLength / 2;
            }
        }

        return s.substring(begin, end + 1);
    }

    private int lengthOfLongestPalindromeWithCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }

        return right - left - 1;
    }

}
