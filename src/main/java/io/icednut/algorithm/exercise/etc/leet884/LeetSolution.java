package io.icednut.algorithm.exercise.etc.leet884;

import java.util.*;

class LeetSolution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> ab = new ArrayList<>();
        String[] s = s1.split(" ");
        String[] z = s2.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        // Count occurrences in both arrays
        for (String word : s) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : z) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Add uncommon words to the list
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                ab.add(word);
            }
        }

        // Convert the list to an array and return
        return ab.toArray(new String[0]);
    }
}