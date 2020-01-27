package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-27 12:21
 **/

public class 至少是其他数字两倍的最大数 {
    public int dominantIndex(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[index]) {
                index = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != index && nums[i] * 2 > nums[index]) {
                return -1;
            }
        }
        return index;
    }
}
