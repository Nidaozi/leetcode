package leetcode;

/**
 * @Author: Mr.Ni
 * @Date: 2020/1/19
 * <p>
 * 输入：[3,2,1,6,0,5]
 * 输出：返回下面这棵树的根节点：
 * <p>
 * 6
 * /   \
 * 3     5
 * \    /
 * 2  0
 * \
 * 1
 *  
 */
public class 最大二叉树 {
    /**
     * @Description: PriorityQueue 可以优化里嵌套元组<value,index>可以达到优化查找最大值下标的时间
     * 把时间复杂度优化到 O(nlog(n))这种优化需要数据量大才有意义
     */
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        if (null == nums || nums.length == 0) {
            return null;
        }
        return construct(nums, 0, nums.length - 1);
    }

    public static TreeNode construct(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int maxIndex = max(nums, l, r);
        TreeNode treeNode = new TreeNode(nums[maxIndex]);
        treeNode.left = construct(nums, l, maxIndex - 1);
        treeNode.right = construct(nums, maxIndex + 1, r);
        return treeNode;
    }

    public static int max(int[] nums, int l, int r) {
        int maxIndex = l;
        for (int i = l; i <= r; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 1, 6, 0, 5};
        TreeNode treeNode = constructMaximumBinaryTree(nums);
        System.out.println(treeNode);
    }
}
