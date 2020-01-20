package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * 说明：解集不能包含重复的子集。
 *
 * 示例:
 *
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 * @author: Mr.Ni
 * @create: 2020-01-20 17:23
 **/

public class 子集 {
    public List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        dfs(nums,arrayList,0);
        lists.add(new ArrayList<>());
        return lists;
    }

    private void dfs(int[] nums, ArrayList<Integer> list, int index) {
        if(index ==  nums.length){
            return;
        }
        ArrayList<Integer> sublist = new ArrayList<>(list);
        lists.add(sublist);
        dfs(nums,sublist,index+1);
        sublist.add(nums[index]);
        dfs(nums,sublist,index+1);
    }

    public static void main(String[] args) {
        子集 zi = new 子集();
        List<List<Integer>> subsets = zi.subsets(new int[]{1, 2, 3});
        System.out.println(subsets);
    }
}
