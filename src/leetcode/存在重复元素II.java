package leetcode;

/**
 * @program: demo01
 * @description:
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 *
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * 示例 3:
 *
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 * @author: Mr.Ni
 * @create: 2019-03-05 13:16
 **/

public class 存在重复元素II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        for (int i = 1;i<nums.length;i++) {
//            for (int j = i-1;j>=0;j--) {
//                if(nums[i]>nums[j]){
//                    break;
//                } else if((nums[i] == nums[j]) && (Math.abs(i - j) <= k)){
//                    return true;
//                }
//            }
//        }
//        return false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < k&&j<nums.length; j++) {
                if(nums[i] == nums[i+j]){
                    return true;
                }
            }
        }
        return false;
    }
}
