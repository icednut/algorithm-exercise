package io.icednut.algorithm.exercise.etc.leet539;

import java.util.List;

class WrongSolution {

    public int findMinDifference(List<String> timePoints) {
        var times = timePoints.stream()
                .map(it -> {
                    var hourAndMinute = it.split(":");

                    var hour = Integer.valueOf(hourAndMinute[0]);
                    var minute = Integer.valueOf(hourAndMinute[1]);

                    if (hour.equals(0) && minute.equals(0)) {
                        return 24 * 60;
                    }

                    return (hour * 60) + minute;
                })
                .toList();

        var minTime = times.stream().min(Integer::compareTo).orElse(0);
        var secondMinTime = getSecondMinTime(times, minTime);

        var maxTime = times.stream().max(Integer::compareTo).orElse(0);
        var secondMaxTime = getSecondMaxTime(times, maxTime);

        return Math.min(
                Math.min(secondMinTime - minTime, maxTime - secondMaxTime),
                1440 - (maxTime - minTime)
        );
    }

    private Integer getSecondMinTime(List<Integer> times, Integer minTime) {
        var minTimeCount = times.stream()
                .filter(it -> it.equals(minTime))
                .count();

        if (minTimeCount == 1) {
            return times.stream()
                    .filter(it -> !it.equals(minTime))
                    .min(Integer::compareTo)
                    .orElse(0);
        }
        return minTime;
    }

    private Integer getSecondMaxTime(List<Integer> times, Integer maxTime) {
        var maxTimeCount = times.stream()
                .filter(it -> it.equals(maxTime))
                .count();

        if (maxTimeCount == 1) {
            return times.stream()
                    .filter(it -> !it.equals(maxTime))
                    .max(Integer::compareTo)
                    .orElse(0);
        }
        return maxTime;
    }
}