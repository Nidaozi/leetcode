package leetcode;

/**
 * @program: demo01
 * @description:
 * @author: Mr.Ni
 * @create: 2019-05-01 19:49
 **/

public class 验证二叉搜索树 {
    public  boolean isValidBST(TreeNode root) {
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public  boolean isValid(TreeNode root,long low,long high) {
        if(root ==null){
            return true;
        }
        if(root.val<=low||root.val>=high){
            return false;
        }
        return isValid(root.left,low,root.val)&&isValid(root.right,root.val,high);
    }

}
