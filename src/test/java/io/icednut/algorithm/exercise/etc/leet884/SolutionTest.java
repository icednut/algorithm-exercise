package io.icednut.algorithm.exercise.etc.leet884;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void test01() {
        var solution = new Solution();

        String[] output = solution.uncommonFromSentences(
                "this apple is sweet",
                "this apple is sour"
        );

        assertArrayEquals(
                new String[]{"sweet", "sour"},
                output
        );
    }

    @Test
    void test02() {
        var solution = new Solution();

        String[] output = solution.uncommonFromSentences(
                "apple apple",
                "banana"
        );

        assertArrayEquals(
                new String[]{"banana"},
                output
        );
    }

    @Test
    void test03() {
        var solution = new Solution();

        String[] output = solution.uncommonFromSentences(
                "fo ly ly",
                "fo fo etx"
        );

        assertArrayEquals(
                new String[]{"etx"},
                output
        );
    }

}