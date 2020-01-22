package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-22 15:01
 **/

public class 二叉树剪枝 {
    public TreeNode pruneTree(TreeNode root) {
        return containsOne(root) ? root : null;
    }

    private boolean containsOne(TreeNode root) {
        if (root == null) {
            return false;
        }
        boolean left = containsOne(root.left);
        boolean right = containsOne(root.right);
        if (!left) root.left = null;
        if (!right) root.right = null;
        return root.val == 1||left||right;
    }
}
