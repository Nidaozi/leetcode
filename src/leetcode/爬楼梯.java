package leetcode;

/**
 * @program: demo01
 * @description: 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。  每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * @author: Mr.Ni
 * @create: 2019-02-06 16:13
 **/

public class 爬楼梯 {
    public int climbStairs(int n) {
        if (n == 0) return 1;
        int[] result = new int[n];
        result[0] = 1;
        if (n >= 2) {
            result[1] = 2;
        }
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n - 1];
    }
    public int climbStairs1(int n) {
        double sqrt5=Math.sqrt(5);
        double fibn=Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/2,n+1);
        return (int)(fibn/sqrt5);
    }
}
