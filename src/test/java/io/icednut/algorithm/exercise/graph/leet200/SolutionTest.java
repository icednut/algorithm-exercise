package io.icednut.algorithm.exercise.graph.leet200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test01() {
        var solution = new Solution();

        int output = solution.numIslands(
                new char[][]{
                        new char[]{'1', '1', '1', '1', '0'},
                        new char[]{'1', '1', '0', '1', '0'},
                        new char[]{'1', '1', '0', '0', '0'},
                        new char[]{'0', '0', '0', '0', '0'},
                }
        );

        assertEquals(1, output);
    }

    @Test
    void test02() {
        var solution = new Solution();

        int output = solution.numIslands(
                new char[][]{
                        new char[]{'1', '1', '0', '0', '0'},
                        new char[]{'1', '1', '0', '0', '0'},
                        new char[]{'0', '0', '1', '0', '0'},
                        new char[]{'0', '0', '0', '1', '1'},
                }
        );

        assertEquals(3, output);
    }

    @Test
    void test03() {
        var solution = new Solution();

        int output = solution.numIslands(
                new char[][]{
                        new char[]{'1', '1', '1'},
                        new char[]{'0', '1', '0'},
                        new char[]{'1', '1', '1'},
                }
        );

        assertEquals(1, output);
    }
}