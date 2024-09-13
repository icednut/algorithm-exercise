package io.icednut.algorithm.exercise.bit.leet1310;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test01() {
        var solution = new Solution();

        var output = solution.xorQueries2(
                new int[]{1, 3, 4, 8},
                new int[][]{
                        new int[]{0, 1},
                        new int[]{1, 2},
                        new int[]{0, 3},
                        new int[]{3, 3},
                }
        );

        assertArrayEquals(
                new int[]{2, 7, 14, 8},
                output
        );
    }

    @Test
    void test02() {
        var solution = new Solution();

        var output = solution.xorQueries2(
                new int[]{4, 8, 2, 10},
                new int[][]{
                        new int[]{2, 3},
                        new int[]{1, 3},
                        new int[]{0, 0},
                        new int[]{0, 3},
                }
        );

        assertArrayEquals(
                new int[]{8, 0, 4, 4},
                output
        );
    }

    @Test
    void test03() {
        var solution = new Solution();

        var output = solution.xorQueries2(
                new int[]{16},
                new int[][]{
                        new int[]{0, 0},
                        new int[]{0, 0},
                        new int[]{0, 0},
                        new int[]{0, 0},
                }
        );

        assertArrayEquals(
                new int[]{16, 16, 16, 16},
                output
        );
    }
}