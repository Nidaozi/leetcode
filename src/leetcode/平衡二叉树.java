package leetcode;

/**
 * @program: demo01
 * @description: 给定一个二叉树，判断它是否是高度平衡的二叉树。  本题中，一棵高度平衡二叉树定义为：  一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 * @author: Mr.Ni
 * @create: 2019-02-09 14:51
 **/

public class 平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        if(root ==null){
            return true;
        }else if(Math.abs(maxDepth(root.left)-maxDepth(root.right))>1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}
