package leetcode;

/**
 * @program: demo01
 * @description: 输入：00000000000000000000000000001011
 * 输出：3 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 * @author: Mr.Ni
 * @create: 2019-03-03 16:36
 **/

public class 位1的个数 {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            n  = n &(n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(128));
    }
}
