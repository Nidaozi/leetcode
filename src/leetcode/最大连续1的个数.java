package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-26 15:13
 **/

public class 最大连续1的个数 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,cur = 0;
        for (int num : nums) {
            if(num == 1){
                cur++;
            }else {
                max = Math.max(max,cur);
                cur = 0;
            }
        }
        return Math.max(cur,max);
    }
}
