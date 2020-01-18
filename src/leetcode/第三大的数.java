package leetcode;

import java.util.Arrays;

/**
 * @program: demo01
 * @description: 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3, 2, 1]
 * <p>
 * 输出: 1
 * <p>
 * 解释: 第三大的数是 1.
 * 示例 2:
 * <p>
 * 输入: [1, 2]
 * <p>
 * 输出: 2
 * <p>
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 * <p>
 * 输入: [2, 2, 3, 1]
 * <p>
 * 输出: 1
 * <p>
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 * @author: Mr.Ni
 * @create: 2019-04-19 10:40
 **/

public class 第三大的数 {
    public static int thirdMax(int[] nums) {
        int[] num = new int[]{nums[0], Integer.MIN_VALUE, Integer.MIN_VALUE};
        int j = 1;
        int i = 1;
        for (i = 1; i < nums.length; i++) {
            boolean flag = true;
            int mini =0;
            int min = num[0];
            for (int k = 0; k < j; k++) {
                if(num[k]<min){
                    min = num[k];
                    mini = k;
                }
                if (nums[i] == num[k]) {
                    flag = false;
                    break;
                }
            }
            if (true == flag) {
                if (j < 3) {
                    num[j] = nums[i];
                    j++;
                    flag = false;
                }else if(nums[i]>min){
                    num[mini] = nums[i];
                }
            }
        }
        Arrays.sort(num);
        if(j<3){
            return num[2];
        }
        return num[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,2,4,1,3,6,0};
        System.out.println(thirdMax(nums));
    }
}
