package io.icednut.algorithm.exercise.graph.leet1367;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test01() {
        var solution = new Solution();

        var output = solution.isSubPath(
                toListNode(
                        Arrays.asList(4, 2, 8)
                ),
                toTree(
                        Arrays.asList(1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1, 3)
                )
        );

        assertEquals(true, output);
    }

    private ListNode toListNode(List<Integer> arr) {
        ListNode head = null;
        ListNode prev = null;

        for (var i = arr.size() - 1; i >= 0; --i) {
            var node = new ListNode(arr.get(i));
            node.next = prev;

            head = node;
            prev = node;
        }
        return head;
    }

    private TreeNode toTree(List<Integer> arr) {
        var treeNodes = new TreeNode[arr.size()];

        for (var i = 0; i < arr.size(); i++) {
            var nodeVal = arr.get(i);

            if (nodeVal != null) {
                treeNodes[i] = new TreeNode(nodeVal);
            }
        }

//        if (treeNodes.isEmpty()) {
//            return null;
//        }

        // 트리의 루트 노드를 생성합니다.
        var root = new TreeNode(arr.get(0));

        // 노드를 관리할 큐를 생성하고 루트 노드를 추가합니다.
        var queue = new LinkedList<TreeNode>();
        queue.add(root);

        var i = 1; // 루트 노드를 제외한 인덱스를 처리하기 위해 1부터 시작

        while (!queue.isEmpty() && i < arr.size()) {
            var currentNode = queue.poll();

            // 왼쪽 자식 노드 추가
            if (i < arr.size() && arr.get(i) != null) {
                currentNode.left = new TreeNode(arr.get(i));
                queue.add(currentNode.left);
            }
            i++;

            // 오른쪽 자식 노드 추가
            if (i < arr.size() && arr.get(i) != null) {
                currentNode.right = new TreeNode(arr.get(i));
                queue.add(currentNode.right);
            }
            i++;
        }

        return root;
    }
}