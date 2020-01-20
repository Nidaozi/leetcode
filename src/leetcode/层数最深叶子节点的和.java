package leetcode;

import javafx.scene.transform.Rotate;

import java.text.DateFormatSymbols;

/**
 * @program: leetcode
 * @description: 给你一棵二叉树，请你返回层数最深的叶子节点的和。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * <p>
 * <p>
 * 输入：root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
 * 输出：15
 *  
 * <p>
 * 提示：
 * <p>
 * 树中节点数目在 1 到 10^4 之间。
 * 每个节点的值在 1 到 100 之间。
 * @author: Mr.Ni
 * @create: 2020-01-20 10:22
 **/
//此题较为简单没有什么边界条件花里胡
//两个方法BFS DFS 复习一下
public class 层数最深叶子节点的和 {

    public static int maxdep = 0;
    public static int total = 0;

    public static void dfs(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        if (val > maxdep) {
            maxdep = val;
            total = root.val;
        } else if (val == maxdep) {
            total += root.val;
        }
        dfs(root.left, val + 1);
        dfs(root.right, val + 1);
    }

    public static int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return total;
    }

}
