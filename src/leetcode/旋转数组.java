package leetcode;

import java.util.Arrays;

/**
 * @program: demo01
 * @description: 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释: 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * @author: Mr.Ni
 * @create: 2019-03-03 16:13
 **/

public class 旋转数组 {
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    public static void reverse(int[] nums, int left, int right) {
        for (int i = left, j = right; i < j; i++, j--) {
            int k = nums[i];
            nums[i] = nums[j];
            nums[j] = k;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2};
        int k = 1;
        rotate(a, k);
        System.out.println(Arrays.toString(a));
    }
}
