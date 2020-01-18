package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: demo01
 * @description:
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 *
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 * @author: Mr.Ni
 * @create: 2019-04-26 22:47
 **/

public class 反转字符串中的元音字母 {
    public static String reverseVowels(String s) {
        //双指针扫描
        char[] chars = s.toCharArray();
        int left =0;
        int right = s.length()-1;
        while(left<right){
            while (left<=right&&isVowel(chars[left++])!=true);
            left--;
            while (left<=right&&isVowel(chars[right--])!=true);
            right++;
            if(left<right){
                char s1 = chars[left];
                chars[left++] = chars[right];
                chars[right--] = s1;
            }
        }
        return new String(chars);
    }
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels( "a.b,."));
    }
}
