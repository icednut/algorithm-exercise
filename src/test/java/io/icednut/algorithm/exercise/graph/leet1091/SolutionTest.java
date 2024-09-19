package io.icednut.algorithm.exercise.graph.leet1091;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void test04() {
        var solution = new Solution();

        int output = solution.shortestPathBinaryMatrix(
                new int[][]{
                        new int[]{0, 0, 0},
                        new int[]{1, 1, 0},
                        new int[]{1, 1, 1},
                }
        );

        assertEquals(-1, output);
    }

    @Test
    void test05() {
        var solution = new Solution();

        int output = solution.shortestPathBinaryMatrix(
                new int[][]{
                        new int[]{0, 0, 0},
                        new int[]{1, 0, 0},
                        new int[]{1, 1, 0},
                }
        );

        assertEquals(3, output);
    }

    @Test
    void test06() {
        var solution = new LeetSolution();

        int output = solution.shortestPathBinaryMatrix(
                new int[][]{
                        new int[]{0, 1, 0, 0, 0, 0},
                        new int[]{0, 1, 0, 1, 1, 0},
                        new int[]{0, 1, 1, 0, 1, 0},
                        new int[]{0, 0, 0, 0, 1, 0},
                        new int[]{1, 1, 1, 1, 1, 0},
                        new int[]{1, 1, 1, 1, 1, 0}
                }
        );

        assertEquals(14, output);
    }

    @Test
    void test07() {
        var solution = new LeetSolution();

        int output = solution.shortestPathBinaryMatrix(
                new int[][]{
                        new int[]{0, 0, 0, 0, 1},
                        new int[]{1, 0, 0, 0, 0},
                        new int[]{0, 1, 0, 1, 0},
                        new int[]{0, 0, 0, 1, 1},
                        new int[]{0, 0, 0, 1, 0}
                }
        );

        assertEquals(-1, output);
    }
}