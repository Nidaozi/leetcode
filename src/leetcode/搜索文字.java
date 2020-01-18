package leetcode;

import java.util.ServiceConfigurationError;

/**
 * @program: demo01
 * @description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。  你可以假设数组中无重复元素。
 * @author: Mr.Ni
 * @create: 2019-02-02 12:27
 **/

public class 搜索文字 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid = left+(right-left)/2;//防止溢出
        while(left<right){
            if(nums[mid] <target){
                left = mid+1;
            }else{
                right = mid;
            }
            mid = left+(right-left)/2;
        }
        return left;
    }

    public static void main(String[] args) {
        int [] nums= new int[]{1,3,5,6};
        System.out.println(searchInsert(nums,2));
    }
}
