package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-22 12:28
 **/
//题目给了有向无环图的概念 n的范围是[2,15]
public class 所有可能的路径 {
    public List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        LinkedList<Integer> link = new LinkedList<>();
        link.add(0);
        solve(graph, 0, link);
        return lists;
    }

    private void solve(int[][] graph, int index, LinkedList<Integer> path) {
        if (index == graph.length - 1) {
            lists.add(new LinkedList<>(path));
            return;
        }
        if (graph[index].length != 0) {
            for (int num : graph[index]) {
                path.addLast(num);
                solve(graph, num, path);
                path.pollLast();
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[][] num = new int[][]{
                {1, 2}, {3}, {3}, {}
        };
        所有可能的路径 Path = new 所有可能的路径();
        List<List<Integer>> lists = Path.allPathsSourceTarget(num);
        System.out.println(lists);
    }
}
