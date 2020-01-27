package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-26 10:22
 **/

public class 第N个泰波那契数 {
    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n < 3) {
            return 1;
        }
        int n1 = 0, n2 = 1, n3 = 1;
        n -= 2;
        while (n-- > 0) {
            int temp = n3;
            n3 = n3 + n2+n1;
            n1 = n2;
            n2 = temp;
        }
        return n3;
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
}
