package leetcode;

import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-24 16:08
 **/

public class 反转字符串中的单词III {
    public static String reverseWords(String s) {
        return (Arrays.stream(s.split(" "))
                .map(s1 ->new StringBuilder(s1).reverse().toString())
                .collect(Collectors.joining(" ")));
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest").equals("s'teL ekat edoCteeL tsetnoc" ));
    }
}
