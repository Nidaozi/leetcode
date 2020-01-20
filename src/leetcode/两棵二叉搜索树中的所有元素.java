package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-20 20:15
 **/

public class 两棵二叉搜索树中的所有元素 {
    ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        dfs(root1);
        dfs(root2);
        Collections.sort(list);
        return list;
    }

    private void dfs(TreeNode root) {
        if(root == null){
            return;
        }
        list.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
