package io.icednut.algorithm.exercise.etc.leet1684;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test01() {
        Solution solution = new Solution();

        int output = solution.countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"});

        assertEquals(2, output);
    }

    @Test
    void test02() {
        Solution solution = new Solution();

        int output = solution.countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"});

        assertEquals(7, output);
    }
}