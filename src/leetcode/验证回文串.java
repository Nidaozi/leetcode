package leetcode;

import java.util.Arrays;

/**
 * @program: demo01
 * @description: 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。  说明：本题中，我们将空字符串定义为有效的回文串。
 * @author: Mr.Ni
 * @create: 2019-02-12 13:13
 **/

public class 验证回文串 {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return true;
        }
        String s1 = new StringBuffer(s).reverse().toString();
        String s2 = s.toLowerCase().replaceAll(" ", "").replaceAll("[\\pP\\p{Punct}]", "");
        String s3 = s1.toLowerCase().replaceAll(" ", "").replaceAll("[\\pP\\p{Punct}]", "");
        System.out.println(s2);
        System.out.println(s3);
        return s2.equals(s3);

    }

    public static void main(String[] args) {
        String s = "`l;`` 1o1 ??;l`";
        System.out.println(isPalindrome(s));
    }
}
