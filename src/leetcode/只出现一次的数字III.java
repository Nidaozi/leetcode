package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-22 14:45
 **/

public class 只出现一次的数字III {
    public int[] singleNumber(int[] nums) {
        int mask = 0;
        for (int num : nums) {
            mask ^= num;
        }
        int diff = mask & (-mask);
        int x = 0;
        for (int num : nums) {
            if ((num & diff) != 0) {
                x ^= num;
            }
        }
        return new int[]{x,x^mask};
    }
}
