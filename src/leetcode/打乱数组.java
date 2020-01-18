package leetcode;

import java.util.Arrays;
import java.util.Random;

/**
 * @program: demo01
 * @description:
 * 打乱一个没有重复元素的数组。
 *
 * 示例:
 *
 * // 以数字集合 1, 2 和 3 初始化数组。
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 *
 * // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
 * solution.shuffle();
 *
 * // 重设数组到它的初始状态[1,2,3]。
 * solution.reset();
 *
 * // 随机返回数组[1,2,3]打乱后的结果。
 * solution.shuffle();
 * @author: Mr.Ni
 * @create: 2019-04-30 21:00
 **/

public class 打乱数组 {
    private int[] nums;
    public 打乱数组(int[] nums) {
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] shiffled = Arrays.copyOf(nums, nums.length);
        Random r  = new Random();
        for (int i = 0; i < shiffled.length; i++)
        {
            int randomIndex = r.nextInt(nums.length - i) + i;
            int tmp = shiffled[i];
            shiffled[i] = shiffled[randomIndex];
            shiffled[randomIndex] = tmp;
        }
        return shiffled;
    }
}
