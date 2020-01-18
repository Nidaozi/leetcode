package leetcode;

import java.util.Arrays;

/**
 * @program: demo01
 * @description: 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * <p>
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * <p>
 * 注意：整数顺序将表示为一个字符串。
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: "1"
 * 示例 2:
 * <p>
 * 输入: 4
 * 输出: "1211"
 * @author: Mr.Ni
 * @create: 2019-02-02 14:09
 **/

public class 报数 {
    public static String countAndSay(int n) {
        StringBuffer sb = new StringBuffer();
        sb.append(1);
        StringBuffer sb1 = new StringBuffer();
        for (int i = 1; i < n; i++) {
            int len = sb.length();
            String temp = sb.substring(0, 1);
            int sum = 0;
            for (int j = 0; j < len; j++) {
                if (temp.equals(sb.substring(j, j + 1))) {
                    sum++;
                } else {
                    sb1.append(sum);
                    sb1.append(temp);
                    temp = sb.substring(j, j + 1);
                    sum = 1;
                }
            }
            sb1.append(sum);
            sb1.append(temp);
            sb = sb1;
            sb1 = new StringBuffer();
        }
        String result = sb.toString();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
