package io.icednut.algorithm.exercise.etc.leet2419;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test01() {
        var solution = new Solution();

        int output = solution.longestSubarray(new int[]{1, 2, 3, 3, 2, 2});

        assertEquals(2, output);
    }

    @Test
    void test02() {
        var solution = new Solution();

        int output = solution.longestSubarray(new int[]{1, 2, 3, 4});

        assertEquals(1, output);
    }

    @Test
    void test03() {
        var solution = new Solution();

        int output = solution.longestSubarray(new int[]{
                311155,
                311155,
                311155,
                311155,
                311155,
                311155,
                311155,
                311155,
                201191,
                311155
        });

        assertEquals(8, output);
    }

    @Test
    void test04() {
        var solution = new Solution();

        int output = solution.longestSubarray(new int[]{
                586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,516529,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,55816,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,586730,232392,232392,294503
        });

        assertEquals(125, output);
    }
}