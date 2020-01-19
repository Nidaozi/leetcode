package leetcode;

/**
 * @program: leetcode
 * * @description:
 * * 根据一棵树的前序遍历与中序遍历构造二叉树。
 * *
 * * 注意:
 * * 你可以假设树中没有重复的元素。
 * *
 * * 例如，给出
 * *
 * * 前序遍历 preorder = [3,9,20,15,7]
 * * 中序遍历 inorder = [9,3,15,20,7]
 * * 返回如下的二叉树：
 * *
 * *     3
 * *    / \
 * *   9  20
 * *     /  \
 * *    15   7
 * * @author: Mr.Ni
 * * @create: 2020-01-19 14:28
 **/

import java.util.HashMap;

/**
 * * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class 从前序与中序遍历序列构造二叉树 {
    private static HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

    //题目比较简单 先序遍历可以得到跟节点再根据中序遍历确认左右节点区间
    //老方法 树的问题采用递归 注意提供中止条件就可以
    //这里有一个优化的方式是使用hashmap 来标记中序序列中数字和下标关系 来达到时间复杂度O(N)
    //原因是题目默认没有重复元素
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        //做一些简单的判断
        if (null == preorder || null == inorder || preorder.length == 0
                || inorder.length == 0 || preorder.length != inorder.length) {
            throw new RuntimeException("data is no good");
            //return null;
        }
        int index = 0;
        for (int num : inorder) {
            hashMap.put(num, index++);
        }
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public static TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStrat, int inEnd) {
        if (preStart > preEnd || inStrat > inEnd) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[preStart]);
        int index = hashMap.get(preorder[preStart++]);
        int leftLength = index - inStrat;
        int rightLength = inEnd - index;
        treeNode.left = buildTree(preorder, preStart, preStart + leftLength - 1, inorder, inStrat, inStrat + leftLength);
        treeNode.right = buildTree(preorder, preStart + leftLength, preEnd, inorder, index + 1, inEnd);
        return treeNode;
    }

    public static void main(String[] args) {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        TreeNode treeNode = buildTree(preorder, inorder);
        System.out.println(treeNode);
    }
}
