package com.algorithm.space.hancock.offer.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf05Test {
  @Test
  void replaceSpace_shouldReturnReplacedSpaceLine_givenWeAreHappy() {
    assertReplaceSpace("We are happy.", "We%20are%20happy.");
  }

  @Test
  void replaceSpace_shouldReturnReplacedSpaceLine_givenHelloWorld() {
    assertReplaceSpace("Hello world!", "Hello%20world!");
  }

  private void assertReplaceSpace(String input, String expected) {
    // given & when
    String replacedSpace = new SolutionOf05().replaceSpace(input);

    // then
    Assertions.assertEquals(expected, replacedSpace);
  }
}