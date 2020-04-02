package leetcode;


/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-09-12 12:42
 **/

public class 区域和检索 {
    private int[] sum;
    public 区域和检索(int[] nums) {
        sum = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            sum[i+1] = sum[i]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j+1]-sum[i];
    }
}
