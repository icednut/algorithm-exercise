package io.icednut.algorithm.exercise.etc.leet539;

import java.util.List;

class Solution {

    public int findMinDifference(List<String> timePoints) {
        var times = timePoints.stream()
                .map(it -> {
                    var hourAndMinute = it.split(":");

                    var hour = Integer.valueOf(hourAndMinute[0]);
                    var minute = Integer.valueOf(hourAndMinute[1]);

                    return (hour * 60) + minute;
                })
                .sorted()
                .toList();

        var result = Integer.MAX_VALUE;

        for (var i = 0; i < times.size(); i++) {
            var currentTime = times.get(i);

            if (i + 1 >= times.size()) {
                result = Math.min(result, 1440 - (currentTime - times.get(0)));
            } else {
                result = Math.min(result, times.get(i + 1) - currentTime);
            }
        }
        return result;
    }
}
