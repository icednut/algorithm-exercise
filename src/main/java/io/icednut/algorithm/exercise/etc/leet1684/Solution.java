package io.icednut.algorithm.exercise.etc.leet1684;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int countConsistentStrings(String allowed, String[] words) {
        char[] allowedChars = allowed.toCharArray();
        int count = 0;

        for (String word : words) {
            var wordChars = word.toCharArray();
            Set<Character> chars = toSet(wordChars);

            for (char c : allowedChars) {
                chars.remove(c);
            }

            if (chars.isEmpty()) {
                count += 1;
            }
        }
        return count;
    }

    private Set<Character> toSet(char[] chars) {
        var charSet = new HashSet<Character>();

        for (char c : chars) {
            charSet.add(c);
        }

        return charSet;
    }
}