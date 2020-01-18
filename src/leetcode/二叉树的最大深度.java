package leetcode;

/**
 * @program: demo01
 * @description: 给定一个二叉树，找出其最大深度。  二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。  说明: 叶子节点是指没有子节点的节点。
 * @author: Mr.Ni
 * @create: 2019-02-09 12:12
 **/

public class 二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}
