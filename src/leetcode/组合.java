package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description: 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * <p>
 * 示例:
 * <p>
 * 输入: n = 4, k = 2
 * 输出:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 * @author: Mr.Ni
 * @create: 2020-01-23 14:43
 **/

public class 组合 {
    List<List<Integer>> output = new LinkedList<>();
    int N = 0;

    public List<List<Integer>> combine(int n, int k) {
        N = n;
        dfs(1, k, new LinkedList<>());
        return output;
    }

    private void dfs(int n, int k, LinkedList<Integer> nums) {
        int size = nums.size();
        if (size == k) {
            output.add(new LinkedList<>(nums));
            return;
        }
        //这个很重要例如一个K超级大 100有这个剪枝就可以少N多步
        // k - size <= N - i + 1
        for (int i = n; k - size + i - 1 <= N; i++) {
            nums.add(i);
            dfs(i + 1, k, nums);
            nums.pollLast();
        }
    }
}
