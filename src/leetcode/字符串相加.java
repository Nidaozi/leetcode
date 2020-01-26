package leetcode;

import java.math.BigInteger;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-25 18:35
 **/

public class 字符串相加 {
    public static String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int temp = n1 + n2 + carry;
            carry = temp / 10;
            res.append(temp % 10);
            i--;
            j--;
        }
        return carry==0?res.reverse().toString():res.append(1).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("11123", "22223"));
    }
}
