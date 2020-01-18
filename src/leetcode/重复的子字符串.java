package leetcode;

/**
 * @program: demo01
 * @description: 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abab"
 * <p>
 * 输出: True
 * <p>
 * 解释: 可由子字符串 "ab" 重复两次构成。
 * 示例 2:
 * <p>
 * 输入: "aba"
 * <p>
 * 输出: False
 * 示例 3:
 * <p>
 * 输入: "abcabcabcabc"
 * <p>
 * 输出: True
 * <p>
 * 解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
 * @author: Mr.Ni
 * @create: 2019-04-12 23:43
 **/

public class 重复的子字符串 {
    public static boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i < s.length(); i++) {
            boolean flag = true;
            if (s.length() % i == 0) {
                for (int j = i; j < s.length(); j += i) {
                    for (int k = 0; k < i; k++) {
                        if (s.charAt(0 + k) != s.charAt(j + k)) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag == true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String string = "ababba";
        System.out.println(repeatedSubstringPattern(string));
    }
}
