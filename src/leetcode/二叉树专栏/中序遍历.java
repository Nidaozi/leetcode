package leetcode.二叉树专栏;


import java.util.*;

public class 中序遍历 {
    public List<Integer> res = new ArrayList<Integer>();
    Deque<TreeNode> stack = new LinkedList();
    public List<Integer> inorderTraversal(TreeNode root) {
       if(root ==null){
           return res;
       }
       TreeNode cur = root;
       while (!stack.isEmpty()||cur !=null){
           while (cur !=null){
               stack.push(cur);
               cur = cur.left;
           }
           TreeNode temp = stack.pop();
           res.add(temp.val);
           cur = temp.right;
       }
       return res;
    }
}
