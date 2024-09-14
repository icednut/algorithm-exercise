package io.icednut.algorithm.exercise.etc.leet2419;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int longestSubarray(int[] nums) {
        var max = Arrays.stream(nums).max().orElse(-1);
        var maxCounts = new ArrayList<Integer>();
        var tempMaxCount = 0;
        var meetMax = false;

        for (var num : nums) {
            if (num == max) {
                tempMaxCount += 1;
                meetMax = true;
                maxCounts.add(tempMaxCount);
            } else if (num != max && meetMax) {
                maxCounts.add(tempMaxCount);
                tempMaxCount = 0;
                meetMax = false;
            }
        }

        return maxCounts.stream().max(Integer::compareTo).orElse(0);
    }
}