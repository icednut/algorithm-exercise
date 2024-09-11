package io.icednut.algorithm.exercise.bit.leet2220;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test01() {
        Solution solution = new Solution();

        // 1010 -> 1011
        // 1011 -> 1111
        // 1111 -> 0111
        int output = solution.minBitFlips(10, 7);

        assertEquals(3, output);
    }

    @Test
    void test02() {
        Solution solution = new Solution();

        // 011 -> 010
        // 010 -> 000
        // 000 -> 100
        int output = solution.minBitFlips(3, 4);

        assertEquals(3, output);
    }

    @Test
    void test03() {
        Solution solution = new Solution();

        // 011 -> 010
        // 010 -> 000
        // 000 -> 100
        int output = solution.minBitFlips(35, 22);

        assertEquals(4, output);
    }

    @Test
    void test04() {
        Solution solution = new Solution();

        int output = solution.minBitFlips(0, 1);

        assertEquals(1, output);
    }
}