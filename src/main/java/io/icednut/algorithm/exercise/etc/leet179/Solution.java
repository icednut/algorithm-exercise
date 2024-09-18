package io.icednut.algorithm.exercise.etc.leet179;

import java.math.BigDecimal;
import java.util.LinkedList;

class Solution {
    public String largestNumber(int[] nums) {
        var strNums = new LinkedList<String>();
        for (var num : nums) {
            strNums.add(Long.toString(num));
        }

        if (strNums.stream().allMatch(it -> Long.parseLong(it) == 0L)) {
            return "0";
        }

        var sorted = strNums.stream()
                .sorted((prev, next) -> {
                    char[] prevNumElements = prev.toCharArray();
                    int prevPrefixNum = Integer.parseInt(Character.toString(prevNumElements[0]));

                    char[] nextNumElements = next.toCharArray();
                    int nextPrefixNum = Integer.parseInt(Character.toString(nextNumElements[0]));

                    if (prevPrefixNum > nextPrefixNum) {
                        return -1;
                    } else {
                        return new BigDecimal(next + prev).compareTo(new BigDecimal(prev + next));
                    }
                })
                .toList();

        return String.join("", sorted);
    }
}