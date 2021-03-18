package com.algorithm.space.hancock.all.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf0005Test {
    @Test
    void longestPalindrome_shouldReturnBab_givenBabad() {
        test("babad", "bab");
    }


    @Test
    void longestPalindrome_shouldReturnBb_givenCbbd() {
        test("cbbd", "bb");
    }

    private void test(String input, String expected) {
        // given

        // when
        String palindrome = new SolutionOf0005().longestPalindrome(input);

        // then
        Assertions.assertThat(palindrome).isEqualTo(expected);
    }
}