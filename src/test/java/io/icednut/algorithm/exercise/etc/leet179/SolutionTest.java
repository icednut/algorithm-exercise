package io.icednut.algorithm.exercise.etc.leet179;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test01() {
        var solution = new Solution();

        String output = solution.largestNumber(new int[]{10, 2});

        assertEquals("210", output);
    }

    @Test
    void test02() {
        var solution = new Solution();

        String output = solution.largestNumber(new int[]{3, 30, 34, 5, 9});

        assertEquals("9534330", output);
    }

    @Test
    void test03() {
        var solution = new Solution();

        String output = solution.largestNumber(new int[]{999999991,9});

        assertEquals("9999999991", output);
    }

    @Test
    void test04() {
        var solution = new Solution();

        String output = solution.largestNumber(new int[]{999999998,999999997,999999999});

        assertEquals("999999999999999998999999997", output);
    }

    @Test
    void test05() {
        var solution = new Solution();

        String output = solution.largestNumber(new int[]{1000000000, 1000000000});

        assertEquals("10000000001000000000", output);
    }
}