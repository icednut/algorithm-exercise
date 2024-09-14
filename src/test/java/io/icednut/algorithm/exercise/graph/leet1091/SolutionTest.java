package io.icednut.algorithm.exercise.graph.leet1091;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test01() {
        var solution = new Solution();

        int output = solution.shortestPathBinaryMatrix(
                new int[][]{
                        new int[]{0, 1},
                        new int[]{1, 0},
                }
        );

        assertEquals(2, output);
    }

    @Test
    void test02() {
        var solution = new Solution();

        int output = solution.shortestPathBinaryMatrix(
                new int[][]{
                        new int[]{0, 0, 0},
                        new int[]{1, 1, 0},
                        new int[]{1, 1, 0},
                }
        );

        assertEquals(4, output);
    }

    @Test
    void test03() {
        var solution = new Solution();

        int output = solution.shortestPathBinaryMatrix(
                new int[][]{
                        new int[]{1, 0, 0},
                        new int[]{1, 1, 0},
                        new int[]{1, 1, 0},
                }
        );

        assertEquals(-1, output);
    }
}