package com.algorithm.space.hancock.all.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf0003Test {
    @Test
    void lengthOfLongestSubstring_shouldReturn3_givenAbcabcbb() {
        test("abcabcbb", 3);
    }

    @Test
    void lengthOfLongestSubstring_shouldReturn2_givenAbba() {
        test("abba", 2);
    }

    private void test(String s, int expected) {
        // when
        int length = new SolutionOf0003().lengthOfLongestSubstring(s);

        // then
        Assertions.assertThat(length).isEqualTo(expected);
    }
}