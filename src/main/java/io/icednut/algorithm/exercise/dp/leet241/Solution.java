package io.icednut.algorithm.exercise.dp.leet241;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> nums = Arrays.stream(expression.split("-|\\+|\\*"))
                .map(Integer::parseInt)
                .toList();

        List<String> operators = Arrays.stream(expression.split("[0-9]"))
                .filter(it -> !it.isBlank())
                .toList();

        List<Integer> result = new LinkedList<>();

        go(nums, operators, result);
        return result;
    }

    private Integer go(List<Integer> nums, List<String> operators, List<Integer> result) {
        if (nums.size() == 2) {
            return calculate(nums.getFirst(), nums.getLast(), operators.getFirst());
        }

        Integer first = nums.getFirst();
        Integer leftResult = calculate(
                first,
                go(nums.subList(1, nums.size()), operators.subList(1, operators.size()), result),
                operators.getFirst()
        );

        Integer last = nums.getLast();
        Integer rightResult = calculate(
                last,
                go(nums.subList(0, nums.size() - 1), operators.subList(0, operators.size() - 1), result),
                operators.getLast()
        );

        if (leftResult != null) {
            result.add(leftResult);
        }
        if (rightResult != null) {
            result.add(rightResult);
        }
        return null;
    }

    private Integer calculate(Integer x, Integer y, String operator) {
        if (x == null || y == null) {
            return null;
        }

        switch (operator) {
            case "*":
                return x * y;
            case "-":
                return x - y;
            case "+":
                return x + y;
            default:
                return x;
        }
    }
}