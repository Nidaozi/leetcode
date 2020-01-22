package leetcode;

import leetcode.N叉树的层序遍历.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-21 12:58
 **/

public class 所有可能的满二叉树 {
    Map<Integer, List<TreeNode>> memo = new HashMap();

    public List<TreeNode> allPossibleFBT(int N) {
        if (!memo.containsKey(N)) {
            List<TreeNode> ans = new LinkedList<>();
            if (N == 1) {
                ans.add(new TreeNode(0));
            } else if (N % 2 == 1) {
                for (int x = 0; x < N; x++) {
                    int y = N - 1 - x;
                    for (TreeNode left : allPossibleFBT(x)) {
                        for (TreeNode right : allPossibleFBT(y)) {
                            TreeNode node = new TreeNode(0);
                            node.left = left;
                            node.right = right;
                            ans.add(node);
                        }
                    }
                }
            }
            memo.put(N, ans);
        }

        return memo.get(N);
    }
}
