package leetcode;

/**
 * @program: demo01
 * @description: 给定一个二叉树，找出其最小深度。  最小深度是从根节点到最近叶子节点的最短路径上的节点数量。  说明: 叶子节点是指没有子节点的节点。
 * @author: Mr.Ni
 * @create: 2019-02-09 15:07
 **/

public class 二叉树的最小深度 {
    public int minDepth(TreeNode root) {
        if(root ==null){
            return 0;
        }else if(root.left ==null){
            return minDepth(root.right)+1;
        }else if(root.right ==null){
            return minDepth(root.left)+1;
        }else{
            return Math.min(minDepth(root.left),minDepth(root.right))+1;
        }
    }
}
