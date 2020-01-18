package leetcode;

/**
 * @program: demo01
 * @description: 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * @author: Mr.Ni
 * @create: 2019-02-12 11:05
 **/

public class 路径总和 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.val;
        if (sum == 0 && root.right == null && root.left == null) {
            return true;
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}
