package leetcode;

/**
 * @program: demo01
 * @description: 给定两个二叉树，编写一个函数来检验它们是否相同。  如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * @author: Mr.Ni
 * @create: 2019-02-09 11:41
 **/

/**
 * Definition for a binary tree node.
 **/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class 相同的树 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p ==null&&q==null){
            return true;
        }
        if(p!=null&&q!=null&&p.val ==q.val){
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }else{
            return false;
        }
    }
}
