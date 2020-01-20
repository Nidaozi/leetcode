package leetcode;

import javafx.scene.transform.Rotate;

/**
 * @program: leetcode
 * @description: 给你一棵二叉树，请你返回满足以下条件的所有节点的值之和：
 * <p>
 * 该节点的祖父节点的值为偶数。（一个节点的祖父节点是指该节点的父节点的父节点。）
 * 如果不存在祖父节点值为偶数的节点，那么返回 0 。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * <p>
 * <p>
 * 输入：root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
 * 输出：18
 * 解释：图中红色节点的祖父节点的值为偶数，蓝色节点为这些红色节点的祖父节点。
 * @create: 2020-01-20 12:22
 **/

public class 祖父节点值为偶数的节点和 {
    public int total = 0;

    public int sumEvenGrandparent(TreeNode root) {
        dfs(root, 1, 1);
        return total;
    }

    private void dfs(TreeNode root, int gpval, int faval) {
        if (root == null) {
            return;
        }
        if (gpval % 2 == 0) {
            total += root.val;
        }
        dfs(root.left, faval, root.val);
        dfs(root.right, faval, root.val);
    }
}
