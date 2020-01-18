package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: demo01
 * @description: 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * @author: Mr.Ni
 * @create: 2019-02-12 11:52
 **/

public class 杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>lists = new ArrayList<List<Integer>>();
        int[][] nums = new int[numRows][numRows];
        int[] nums1 = new int[numRows];
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < i; j++) {
                if(j ==0 ||j==i)
                    nums[i][j] = 1;
                else{
                    nums[i][j] = nums[i-1][j-1]+nums[i-1][j];
                }
                list.add(nums[i][j]);
            }
            lists.add(list);
        }
        return lists;
    }
}
