package com.algorithm.space.hancock.all.solution;

import java.util.HashMap;

public class SolutionOf0003 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charAndIndexMap = new HashMap<>();

        int beginIndex = 0;
        int endIndex;
        int maxLength = 0;

        char[] chars = s.toCharArray();
        for (int index = 0; index < chars.length; index++) {
            if (charAndIndexMap.containsKey(chars[index])) {
                int tempBegin = beginIndex;
                beginIndex = charAndIndexMap.get(chars[index]) + 1;
                for (int leftIndex = tempBegin; leftIndex < beginIndex; leftIndex++) {
                    charAndIndexMap.remove(chars[leftIndex]);
                }
            }

            charAndIndexMap.put(chars[index], index);
            endIndex = index;

            int length = endIndex - beginIndex + 1;
            maxLength = Math.max(length, maxLength);
        }

        return maxLength;
    }
}
