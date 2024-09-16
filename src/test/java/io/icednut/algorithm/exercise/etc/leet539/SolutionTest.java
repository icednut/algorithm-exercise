package io.icednut.algorithm.exercise.etc.leet539;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test01() {
        var solution = new Solution();

        int output = solution.findMinDifference(
                List.of("23:59", "00:00")
        );

        assertEquals(1, output);
    }

    @Test
    void test02() {
        var solution = new Solution();

        int output = solution.findMinDifference(
                List.of("00:00", "23:59", "00:00")
        );

        assertEquals(0, output);
    }

    @Test
    void test03() {
        var solution = new Solution();

        int output = solution.findMinDifference(
                List.of("12:12", "00:13")
        );

        assertEquals(719, output);
    }

    @Test
    void test04() {
        var solution = new Solution();

        int output = solution.findMinDifference(
                List.of("12:01", "00:10", "00:01")
        );

        assertEquals(9, output);
    }

    @Test
    void test05() {
        var solution = new Solution();

        int output = solution.findMinDifference(
                List.of("05:31", "22:08", "00:35")
        );

        assertEquals(147, output);
    }

    @Test
    void test06() {
        var solution = new Solution();

        int output = solution.findMinDifference(
                List.of("17:41", "22:06", "20:59", "17:37", "04:14")
        );

        assertEquals(4, output);
    }
}