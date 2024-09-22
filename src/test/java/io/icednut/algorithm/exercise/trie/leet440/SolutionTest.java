package io.icednut.algorithm.exercise.trie.leet440;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test01() {
        var solution = new Solution();

        int output = solution.findKthNumber(13, 2);

        assertEquals(10, output);
    }

    @Test
    void test02() {
        var solution = new Solution();

        int output = solution.findKthNumber(1, 1);

        assertEquals(1, output);
    }

    @Test
    void test03() {
        var solution = new Solution();

        int output = solution.findKthNumber(2, 2);

        assertEquals(2, output);
    }

    @Test
    void test04() {
        var solution = new Solution();

        int output = solution.findKthNumber(7747794, 5857460);

        assertEquals(6271710, output);
    }
}