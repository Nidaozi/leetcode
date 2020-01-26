package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-25 10:21
 **/

public class 分割平衡字符串 {
    public int balancedStringSplit(String s) {
        int total = 0;
        int sign = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                sign++;
            } else {
                sign--;
            }
            if (sign == 0) {
                total++;
            }
        }
        return total;
    }
}
