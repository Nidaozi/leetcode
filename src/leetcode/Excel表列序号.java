package leetcode;

/**
 * @program: demo01
 * @description: 示例 1:  输入: "A" 输出: 1
 * 示例 2:  输入: "AB" 输出: 28
 * 示例 3:  输入: "ZY" 输出: 701
 * @author: Mr.Ni
 * @create: 2019-03-01 21:11
 **/

public class Excel表列序号 {
    public int titleToNumber(String s) {
        if (s == null) {
            return 0;
        }
        char[] str = s.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            count =count*26+ (int) (str[i] - 'A' + 1);
        }
        return count;
    }
}
