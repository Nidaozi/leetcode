package leetcode;

import jdk.nashorn.internal.ir.ReturnNode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-29 10:43
 **/

public class 第N个数字 {
    public static int findNthDigit(int n) {
        int i = 1;
        while (n > i * Math.pow(10, i - 1) * 9) {
            n -= i * Math.pow(10, i - 1) * 9;
            i++;

        }
        int num = (n - 1) / i + (int) Math.pow(10, i - 1);
        //int k = n%i==0?i-1:n%i-1;
        int k = (n % i + i - 1) % i;
        return Integer.toString(num).charAt(k) - '0';
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(189));

    }
}
