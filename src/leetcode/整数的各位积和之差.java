package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-23 18:10
 **/

public class 整数的各位积和之差 {
    public int subtractProductAndSum(int n) {
        int mul = 1;
        int plus = 0;
        while (n != 0) {
            int k = n % 10;
            mul *= k;
            plus += k;
            n /= 10;
        }
        return mul - plus;
    }
}
