package leetcode;

/**
 * @program: demo01
 * @description: 给定一个整数 n，返回 n! 结果尾数中零的数量。
 * 示例 1:  输入: 3 输出: 0 解释: 3! = 6, 尾数中没有零。
 * 示例 2:  输入: 5 输出: 1 解释: 5! = 120, 尾数中有 1 个零.
 * @author: Mr.Ni
 * @create: 2019-03-01 21:03
 **/

public class 阶乘后的零 {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n>0){
            count+= n/5;
            n/=5;
        }
        return count;
    }
}
