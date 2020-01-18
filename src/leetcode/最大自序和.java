package leetcode;

/**
 * @program: demo01
 * @description: 给定一个整数数组 nums ，找到一个具有最大和的连续子数组
 * （子数组最少包含一个元素），返回其最大和。
 * @author: Mr.Ni
 * @create: 2019-02-02 10:29
 **/

public class 最大自序和 {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int thisSum = 0;
        for (int num : nums) {
            if(thisSum >0){
                thisSum+=num;
            }else{
                thisSum = num;
            }
            maxSum = Math.max(maxSum,thisSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, -1,-4};
        System.out.println(maxSubArray(nums));
    }
}
