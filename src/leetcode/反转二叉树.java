package leetcode;

/**
 * @program: demo01
 * @description:
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * @author: Mr.Ni
 * @create: 2019-03-21 15:53
 **/

public class 反转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if(root !=null){
            TreeNode left = invertTree(root.right);
            TreeNode right = invertTree(root.left);
            root.left = left;
            root.right = right;
        }
        return root;
    }

}
