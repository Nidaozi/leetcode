package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-30 14:14
 **/

public class 二叉搜索树结点最小距离 {
    int inedx = 0;
    int[] num = new int[100];
    int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        minDiffInBST1(root);
        for (int i = 1; i <inedx ; i++) {
            min = Math.min(min,num[i]-num[i-1]);

        }
        return min;
    }
    public void minDiffInBST1(TreeNode root) {
        if(root!=null){
            minDiffInBST(root.left);
            num[inedx++] = root.val;
            minDiffInBST(root.right);
        }
    }
}
