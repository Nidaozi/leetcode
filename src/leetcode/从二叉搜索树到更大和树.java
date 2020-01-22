package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-22 15:46
 **/

public class 从二叉搜索树到更大和树 {
    int total = 0;
    //二叉搜索树 中序遍历
    public TreeNode bstToGst(TreeNode root) {
        if(root == null){
            return null;
        }
        bstToGst(root.right);
        total+=root.val;
        root.val = total;
        bstToGst(root.left);
        return root;
    }
}
