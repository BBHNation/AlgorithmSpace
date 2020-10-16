package com.algorithm.space.hancock.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf10Test {

  @Test
  void fib_shouldReturn2_givenInputIs3() {
    calculateFib(3, 2);
  }

  @Test
  void fib_shouldReturn6_givenInputIs5() {
    calculateFib(5, 5);
  }

  @Test
  void fib_shouldReturn832040_givenInputIs30() {
    calculateFib(30, 832040);
  }

  @Test
  void fib_shouldReturn1134903170_givenInputIs45() {
    calculateFib(45, 1134903170);
  }

  @Test
  void fib_shouldReturn980107325_givenInputIs100() {
    calculateFib(100, -980107325);
  }

  @Test
  void fib_shouldReturn0_givenInputIs0() {
    calculateFib(0, 0);
  }


  private void calculateFib(int input, int expected) {
    // given
    SolutionOf10 solutionOf10 = new SolutionOf10();

    // when
    int fib = solutionOf10.fib(input);

    // then
    Assertions.assertEquals(expected, fib);
  }
}