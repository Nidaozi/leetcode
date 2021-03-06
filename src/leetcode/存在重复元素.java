package leetcode;

import java.util.Arrays;

/**
 * @program: demo01
 * @description:
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: false
 * 示例 3:
 *
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 * @author: Mr.Ni
 * @create: 2019-03-05 12:12
 **/

public class 存在重复元素 {
    public static boolean containsDuplicate(int[] nums) {
        if(nums ==null||nums.length<2){
            return false;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if((nums[i]^nums[i-1])==0){
                return  true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,3,2,1}));
    }
}
