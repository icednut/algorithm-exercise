package io.icednut.algorithm.exercise.bit.leet2220;

class Solution {

    public int minBitFlips(int start, int goal) {
        int startLength = Integer.toBinaryString(start).length();
        int goalLength = Integer.toBinaryString(goal).length();
        int length = 0;

        if (startLength > goalLength) {
            length = startLength;
        } else {
            length = goalLength;
        }

        String formattedStart = binaryString(start, length);
        String formattedGoal = binaryString(goal, length);

        System.out.println(start + "=" + formattedStart);
        System.out.println(goal + "=" + formattedGoal);

        int target = xor(start, goal);
        int i = 0;
        String result = binaryString(target, length);
        System.out.println("[" + i + "] " + result);

        return countOne(result.toCharArray());
    }

    private int countOne(char[] chars) {
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                result += 1;
            }
        }
        return result;
    }

    private int xor(int start, int target) {
        return start ^ target;
    }

    private String binaryString(int number, int length) {
        return ("%" + length + "s")
                .formatted(Integer.toBinaryString(number))
                .replaceAll(" ", "0");
    }
}