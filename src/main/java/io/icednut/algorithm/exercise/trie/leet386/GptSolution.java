package io.icednut.algorithm.exercise.trie.leet386;

import java.util.ArrayList;
import java.util.List;

class GptSolution {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        // 1부터 9까지 루트 노드 탐색
        for (int i = 1; i <= 9; i++) {
            dfs(i, n, result);
        }
        return result;
    }

    // 깊이 우선 탐색 (DFS)
    private static void dfs(int current, int n, List<Integer> result) {
        // 현재 노드를 결과에 추가
        if (current > n) {
            return;
        }
        result.add(current);

        // 자식 노드 탐색: current * 10, current * 10 + 1, ..., current * 10 + 9
        for (int i = 0; i <= 9; i++) {
            int next = current * 10 + i;
            if (next > n) {
                return;
            }
            dfs(next, n, result);
        }
    }
}