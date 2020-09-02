package leetcode.二叉树专栏;


import java.util.ArrayList;
import java.util.List;

public class 前序遍历 {

    private List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return list;
    }
    public void preorder(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
