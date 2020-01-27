package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-27 11:24
 **/

public class 路径总和III {
    int total = 0;

    public int pathSum(TreeNode root, int sum) {
        if(root == null){
            return 0;
        }
        dfs(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return total;
    }

    private void dfs(TreeNode root, int cursum) {
        if (root == null) {
            return;
        }
        cursum -= root.val;
        if(cursum == 0){
            total++;
        }
        dfs(root.left, cursum);
        dfs(root.right, cursum);
    }

    public static void main(String[] args) {
        路径总和III solution = new 路径总和III();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.right.right = new TreeNode(11);
        root.left.left  = new TreeNode(3);
        root.left.left.left  = new TreeNode(3);
        root.left.left.right  = new TreeNode(-2);
        root.left.right  = new TreeNode(2);
        root.left.right.right  = new TreeNode(1);

        System.out.println(solution.pathSum(root, 8));
    }
}
