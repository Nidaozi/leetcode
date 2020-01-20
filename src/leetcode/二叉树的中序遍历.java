package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-20 20:31
 **/

public class 二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root,list);
        return list;
    }

    private void dfs(TreeNode root, ArrayList<Integer> list) {
        if(root == null){
            return;
        }
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }
}
