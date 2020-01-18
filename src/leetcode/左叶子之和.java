package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-29 16:10
 **/

public class 左叶子之和 {
    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumOfLeft(root, false);
    }

    public static int sumOfLeft(TreeNode root, boolean left) {
        if (root.right == null && root.left == null) {
            return left ? root.val : 0;
        } else if (root.right != null && root.left != null) {
            return sumOfLeft(root.right, false) + sumOfLeft(root.left, true);
        } else if (root.left != null) {
            return sumOfLeft(root.left, true);
        }
        return sumOfLeft(root.right, false);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = new TreeNode(4);
        t1.left.right = new TreeNode(5);
        System.out.println(sumOfLeftLeaves(t1));
    }
}
