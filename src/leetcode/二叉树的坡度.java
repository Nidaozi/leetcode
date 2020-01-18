package leetcode;

/**
 * @program: demo01
 * @description:
 * 给定一个二叉树，计算整个树的坡度。
 *
 * 一个树的节点的坡度定义即为，该节点左子树的结点之和和右子树结点之和的差的绝对值。空结点的的坡度是0。
 *
 * 整个树的坡度就是其所有节点的坡度之和。
 *
 * 示例:
 *
 * 输入:
 *          1
 *        /   \
 *       2     3
 * 输出: 1
 * 解释:
 * 结点的坡度 2 : 0
 * 结点的坡度 3 : 0
 * 结点的坡度 1 : |2-3| = 1
 * 树的坡度 : 0 + 0 + 1 = 1
 * @author: Mr.Ni
 * @create: 2019-05-04 20:38
 **/

public class 二叉树的坡度 {
    private  int n = 0;
    public int findTilt(TreeNode root) {
        add(root);
        return n;
    }
    public int add(TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }
        int left = add(treeNode.left);
        int right = add(treeNode.right);
        n += Math.abs(left-right);
        return treeNode.val+left+right;
    }
//    public int findTilt(TreeNode root) {
//        if(root == null){
//            return 0;
//        }
//        return Math.abs(add(root.left)-add(root.right))+findTilt(root.left)+findTilt(root.right);
//    }
//    public int add(TreeNode root) {
//        if (root==null){
//            return 0;
//        }
//        return root.val+add(root.left)+add(root.right);
//    }
}
