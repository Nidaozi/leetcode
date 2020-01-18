package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-29 14:43
 **/

public class 二叉搜索树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        int rootval = root.val;
        int pval = p.val;
        int qval= q.val;
        if(qval<rootval&&pval<rootval){
            return lowestCommonAncestor(root.left,p,q);
        }else if(qval>rootval&&pval>rootval){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;

    }
}
