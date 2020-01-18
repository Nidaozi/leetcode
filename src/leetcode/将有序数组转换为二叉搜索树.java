package leetcode;

/**
 * @program: demo01
 * @description: 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。  本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * @author: Mr.Ni
 * @create: 2019-02-09 14:27
 **/

public class 将有序数组转换为二叉搜索树 {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return ArrayToBST(nums,0,nums.length-1);
    }
    public static TreeNode ArrayToBST(int[] nums,int left,int right) {
          if(left>right)
              return null;
          int mid = (int)(right+left)/2;
          int x = nums[mid];
          TreeNode p = new TreeNode(x);
          p.left = ArrayToBST(nums,left,mid-1);
          p.right = ArrayToBST(nums,mid+1,right);
          return p;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10,-3,0,5,9};
        System.out.println(sortedArrayToBST(nums));
    }
}
