package leetcode;

/**
 * @program: demo01
 * @description:
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 *
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 *
 * 示例 1:
 *
 * 输入:
 *
 *               5
 *              / \
 *             4   5
 *            / \   \
 *           1   1   5
 * 输出:
 *
 * 2
 * 示例 2:
 *
 * 输入:
 *
 *               1
 *              / \
 *             4   5
 *            / \   \
 *           4   4   5
 * 输出:
 *
 * 2
 * @author: Mr.Ni
 * @create: 2019-05-04 22:07
 **/

public class 最长同值路径 {
    private int ans = 0;
    public int longestUnivaluePath(TreeNode root) {
        arrowLength(root);
        return ans;
    }
    public int arrowLength(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left  = arrowLength(root.left);
        int right = arrowLength(root.right);
        int arrowleft =0,arrowright = 0;
        if(root.left!=null&&root.val == root.left.val){
            arrowleft =left+1;
        }
        if(root.right!=null&&root.val == root.right.val){
            arrowright =right+1;
        }
        ans = Math.max(ans,arrowleft+arrowright);
        return Math.max(arrowleft,arrowright);
    }
}
