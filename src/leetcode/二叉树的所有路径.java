package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-28 17:56
 **/

import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class 二叉树的所有路径 {
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList paths = new LinkedList();
        construct_paths(root,"",paths);
        return paths;
    }
    public void construct_paths(TreeNode root, String path, LinkedList<String> paths) {
        if(root!=null){
            path+=(Integer.toString(root.val));
            if(root.right==null&&root.left==null){ //是叶子节点
                paths.add(path.toString());
            }else{
                path+="->";
                construct_paths(root.right,path,paths);
                construct_paths(root.left,path,paths);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.right = new TreeNode(5);
        二叉树的所有路径 s = new 二叉树的所有路径();
        List<String> list = s.binaryTreePaths(t1);
        for (String s1 : list) {
            System.out.println(s1);
        }

    }
}
