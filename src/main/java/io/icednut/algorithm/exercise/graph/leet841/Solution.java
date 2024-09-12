package io.icednut.algorithm.exercise.graph.leet841;

import java.util.HashSet;
import java.util.List;

class Solution {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        var seen = new HashSet<Integer>();

        dfs(0, rooms, seen);

        return seen.size() == rooms.size();
    }

    private void dfs(Integer index, List<List<Integer>> rooms, HashSet<Integer> seen) {
        List<Integer> neighbors = rooms.get(index);

        if (!seen.contains(index)) {
            seen.add(index);

            neighbors.forEach(neighbor -> dfs(neighbor, rooms, seen));
        }
    }
}