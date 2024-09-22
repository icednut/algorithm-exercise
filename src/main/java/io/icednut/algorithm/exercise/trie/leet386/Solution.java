package io.icednut.algorithm.exercise.trie.leet386;

import java.util.LinkedList;
import java.util.List;

class Solution {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new LinkedList<>();

        for (var i = 1; i < 10; i++) {
            dfs(n, i, result);
        }
        return result;
    }

    private void dfs(int limit, int node, List<Integer> result) {
        if (node > limit) {
            return;
        }

        result.add(node);

        var nextNode = node * 10;
        for (var i = 0; i < 10; i++) {
            if (nextNode + i > limit) {
                return;
            }
            dfs(limit, nextNode + i, result);
        }
    }
}
