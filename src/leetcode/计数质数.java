package leetcode;

/**
 * @program: demo01
 * @description: 统计所有小于非负整数 n 的质数的数量。
 * <p>
 * 示例:
 * <p>
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * @author: Mr.Ni
 * @create: 2019-03-03 22:54
 **/

public class 计数质数 {

    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];

        int count = 0;
        for (int i = 2; i< n; i++) {
            if (isPrime[i] == false) {
                count++;
                for (int j = i + i; j < n; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        return count;

    }
}
