package io.icednut.algorithm.exercise.etc.leet884;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {

    public String[] uncommonFromSentences(String s1, String s2) {
        var s1Words = s1.split(" ");
        var s2Words = s2.split(" ");
        var s1WordMap = getWordMap(s1Words);
        var s2WordMap = getWordMap(s2Words);

        var commonWords = new HashSet<String>();

        collectCommonWords(commonWords, s1WordMap);
        collectCommonWords(commonWords, s2WordMap);

        var uncommonWords = new HashSet<String>();
        collectCommonWordsFromEach(uncommonWords, commonWords, s1WordMap, s2WordMap);
        collectCommonWordsFromEach(uncommonWords, commonWords, s2WordMap, s1WordMap);

        return uncommonWords.toArray(new String[]{});
    }

    private Map<String, Integer> getWordMap(String[] words) {
        var wordMap = new HashMap<String, Integer>();

        for (var word : words) {
            wordMap.merge(word, 1, Integer::sum);
        }
        return wordMap;
    }

    private void collectCommonWords(Set<String> commonWords, Map<String, Integer> wordMap) {
        for (var entry : wordMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (value > 1) {
                commonWords.add(key);
            }
        }
    }

    private void collectCommonWordsFromEach(
            Set<String> uncommonWords,
            Set<String> commonWords,
            Map<String, Integer> wordMap1,
            Map<String, Integer> wordMap2) {

        for (var key : wordMap1.keySet()) {
            if (wordMap2.get(key) == null && !commonWords.contains(key)) {
                uncommonWords.add(key);
            }
        }
    }
}