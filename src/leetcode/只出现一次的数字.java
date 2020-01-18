package leetcode;

/**
 * @program: demo01
 * @description: 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @author: Mr.Ni
 * @create: 2019-02-21 14:48
 **/

public class 只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        return num;
    }
}
