package com.algorithm.space.hancock.offer.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf12Test {

    @Test
    void exist_shouldReturnTrue_givenBoardIsABCESFCSADEEandWordIsABCCED() {
        testExist("ABCCED", new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, true);
    }

    @Test
    void exist_shouldReturnFalse_givenBoardIsAAandWordIsAAA() {
        testExist("AAA", new char[][]{{'A', 'A'}}, false);
    }


    private void testExist(String word, char[][] board, boolean expected) {
        // given when
        boolean exist = new SolutionOf12().exist(board, word);

        // then
        Assertions.assertThat(exist).isEqualTo(expected);
    }


}