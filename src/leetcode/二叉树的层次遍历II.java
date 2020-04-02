package leetcode;


import java.util.*;

/**
 * @program: demo01
 * @description: 给定一个二叉树，返回其节点值自底向上的层次遍历。
 * （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * 例如： 给定二叉树 [3,9,20,null,null,15,7],
 * @author: Mr.Ni
 * @create: 2019-02-09 12:17
 **/

public class 二叉树的层次遍历II {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Queue<TreeNode> dq = new ArrayDeque<TreeNode>();
        List<List<Integer>> retList = new ArrayList<List<Integer>>();

        if (root != null) dq.add(root);
        while (dq != null && !dq.isEmpty()) {
            Queue<TreeNode> tempQ = new ArrayDeque<TreeNode>();

            List<Integer> subArray = new ArrayList<Integer>();
            while (!dq.isEmpty()) {
                TreeNode node = dq.poll();
                subArray.add(node.val);
                if (node.left != null) tempQ.add(node.left);
                if (node.right != null) tempQ.add(node.right);
            }
            dq = tempQ;
            retList.add(subArray);

        }
        Collections.reverse(retList);
        return retList;
    }
}
