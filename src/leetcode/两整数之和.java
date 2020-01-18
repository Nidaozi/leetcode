package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-28 19:16
 **/

public class 两整数之和 {
    /**
    * @Description: 算法比较精妙 先进行异或不考虑进位,再把进位算出来如此反复
    * @Param: [a, b]
    * @return: int
    * @Author: Mr.Ni
    * @Date: 2019/8/28
    */
    public static int getSum(int a, int b) {
        return b==0?a:getSum(a^b,(a&b)<<1);

    }

    public static void main(String[] args) {
        System.out.println(getSum(10,5));
    }
}
