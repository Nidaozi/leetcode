package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-26 16:04
 **/

public class 二叉搜索树的范围和 {
    int total = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        solve(root, L, R);
        return total;
    }

    private void solve(TreeNode root, int l, int r) {
        if (root == null) {
            return;
        }
        if (l <= root.val && r >= root.val) {
            total += root.val;
        }
        if (l < root.val) {
            solve(root.left, l, r);
        }

        if (r > root.val) {
            solve(root.right, l, r);
        }
    }
}
