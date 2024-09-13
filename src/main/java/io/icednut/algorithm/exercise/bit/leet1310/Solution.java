package io.icednut.algorithm.exercise.bit.leet1310;

class Solution {

    public int[] xorQueries(int[] arr, int[][] queries) {
        var xorArr = new int[queries.length];

        for (var i = 0; i < queries.length; i++) {
            var query = queries[i];
            var start = query[0];
            var end = query[1];

            int result = arr[start];

            for (var j = start + 1; j <= end; j++) {
                int target = arr[j];
                result = result ^ target;
            }
            xorArr[i] = result;
        }
        return xorArr;
    }

    public int[] xorQueries2(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] nums = new int[n];
        int[] res = new int[queries.length];
        nums[0] = arr[0];
        for (int i = 1; i < n; i++) {
            nums[i] = nums[i - 1] ^ arr[i];
        }
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            if (a == 0) {
                res[i] = nums[b];
            } else {
                res[i] = nums[b] ^ nums[a - 1];
            }
        }
        return res;
    }
}