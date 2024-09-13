package io.icednut.algorithm.exercise.graph.leet733;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void test01() {
        var solution = new Solution();

        int[][] output = solution.floodFill(
                new int[][]{
                        new int[]{1, 1, 1},
                        new int[]{1, 1, 0},
                        new int[]{1, 0, 1},
                },
                1, 1, 2
        );

        assertArrayEquals(
                new int[][]{
                        new int[]{2, 2, 2},
                        new int[]{2, 2, 0},
                        new int[]{2, 0, 1},
                },
                output
        );
    }

    @Test
    void test02() {
        var solution = new Solution();

        int[][] output = solution.floodFill(
                new int[][]{
                        new int[]{0, 0, 0},
                        new int[]{0, 0, 0},
                        new int[]{0, 0, 0},
                },
                0, 0, 0
        );

        assertArrayEquals(
                new int[][]{
                        new int[]{0, 0, 0},
                        new int[]{0, 0, 0},
                        new int[]{0, 0, 0},
                },
                output
        );
    }
}