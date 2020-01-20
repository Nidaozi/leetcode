package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-20 17:16
 **/

public class 比特位计数 {
    //题目比较简单 就是一个遍历
    //做过BitCount就能知道 n&n-1 可以 去掉最右边的1
    public int[] countBits(int num) {
        int[] nums = new int[num+1];
        for (int i = 1; i <= num; i++) {
            nums[i] = nums[i&i-1]+1;
        }
        return nums;
    }
}
