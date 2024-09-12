package io.icednut.algorithm.exercise.graph.leet841;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test01() {
        var solution = new Solution();

        boolean output = solution.canVisitAllRooms(List.of(
                List.of(1),
                List.of(2),
                List.of(3),
                List.of()
        ));

        assertEquals(true, output);
    }

    @Test
    void test02() {
        var solution = new Solution();

        boolean output = solution.canVisitAllRooms(List.of(
                List.of(1, 3),
                List.of(3, 0, 1),
                List.of(2),
                List.of(0)
        ));

        assertEquals(false, output);
    }
}