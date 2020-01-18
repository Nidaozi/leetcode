package leetcode;

/**
 * @program: demo01
 * @description: 给定一个二叉树，检查它是否是镜像对称的。  例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * @author: Mr.Ni
 * @create: 2019-02-09 11:49
 **/
// Definition for a binary tree node.如果你可以运用递归和迭代两种方法解决这个问题，会很加分。

public class 对称二叉树 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public boolean isSymmetric(TreeNode root){
        return isisMirror(root,root);
    }
    public boolean isisMirror(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }else if(p ==null||q ==null||p.val!=q.val){
            return false;
        }else{
            return isisMirror(p.left,q.right)
                   &&isisMirror(p.right,q.left);
        }
    }
}
