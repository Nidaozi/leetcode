package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-31 09:44
 **/

public class 二叉树的直径 {
    public int left;
    public int right;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        if (root.left != null && root.right != null) {
            diameterOfTree(root.left, 0, true);
            diameterOfTree(root.right, 1, false);
        } else if (root.left != null) {
            diameterOfTree(root.left, 1, true);

        } else {
            diameterOfTree(root.right, 1, false);
        }
        return left + right;
    }

    public void diameterOfTree(TreeNode root, int sum, boolean sign) {
        if (root == null || (root.left == null && root.right == null)) {
            if (sign) {
                left = Math.max(left, sum);
            } else {
                right = Math.max(right, sum);
            }
            return;
        }
        if (root.left != null && root.right != null) {
            diameterOfTree(root.left, sum + 1, sign);
            diameterOfTree(root.right, sum + 1, sign);
        } else if (root.right != null) {
            diameterOfTree(root.right, sum + 1, sign);

        } else {
            diameterOfTree(root.left, sum + 1, sign);

        }
    }


}
