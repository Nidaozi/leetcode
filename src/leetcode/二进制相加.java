package leetcode;

import java.util.Arrays;

/**
 * @program: demo01
 * @description: 给定两个二进制字符串，返回他们的和（用二进制表示）。  输入为非空字符串且只包含数字 1 和 0。
 * @author: Mr.Ni
 * @create: 2019-02-03 17:15
 **/

public class 二进制相加 {
    public static String addBinary(String a, String b) {
        char[] stra = a.toCharArray();
        char[] strb = b.toCharArray();
        char[] strc;
        if (stra.length < strb.length) {
            strc = stra;
            stra = strb;
            strb = strc;
        }
        for (int i = strb.length - 1, j = stra.length - 1; i >= 0; i--, j--) {
            stra[j] += strb[i]-'0';
        }
        for (int i = stra.length - 1; i > 0; i--) {
            if (stra[i] > '1') {
                stra[i] -= '2'-'0';
                stra[i - 1]++;
            }
        }
        if (stra[0] > '1') {
            char[] newDigits = new char[stra.length + 1];
            newDigits[0] = '1';
            newDigits[1] = (char)((int)stra[0] - 2);
            for (int i = 1; i < stra.length; i++) {
                newDigits[i + 1] = stra[i];
            }
            return new String(newDigits);
        }
        return new String(stra);
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1010","1011"));
    }
}
