package leetcode;

/**
 * @program: demo01
 * @description:
 * @author: Mr.Ni
 * @create: 2019-03-05 13:28
 **/

public class 二的幂 {
    public boolean isPowerOfTwo(int n) {
        return Integer.bitCount(n)==1;
    }
}
