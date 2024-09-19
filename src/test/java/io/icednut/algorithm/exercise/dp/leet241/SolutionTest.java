package io.icednut.algorithm.exercise.dp.leet241;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test01() {
        var solution = new Solution();

        List<Integer> output = solution.diffWaysToCompute("2-1-1");

        /*
            ((2-1)-1) = 0
            (2-(1-1)) = 2
         */
        // 1 2 3
        // 2 3 1
        assertIterableEquals(Arrays.asList(0, 2), output);
    }

    @Test
    void test02() {
        var solution = new Solution();

        List<Integer> output = solution.diffWaysToCompute("2*3-4*5");

        /*
            (2*(3-(4*5))) = -34
            ((2*3)-(4*5)) = -14
            ((2*(3-4))*5) = -10
            (2*((3-4)*5)) = -10
            (((2*3)-4)*5) = 10
         */
        assertIterableEquals(Arrays.asList(-34, -14, -10, -10, 10), output);
    }
}