package leetcode;

/**
 * @program: demo01
 * @description:
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 27
 * 输出: true
 * 示例 2:
 *
 * 输入: 0
 * 输出: false
 * 示例 3:
 *
 * 输入: 9
 * 输出: true
 * 示例 4:
 *
 * 输入: 45
 * 输出: false
 * @author: Mr.Ni
 * @create: 2019-04-25 12:19
 **/
//三的19次方是INT范围内3的幂的最大值 任何3的幂都可以被他整除
public class 三的幂 {
    public boolean isPowerOfThree(int n) {
        return (n>0&&Math.pow(3,19)%n==0);
    }
}
