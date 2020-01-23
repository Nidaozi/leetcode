package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-23 17:23
 **/

public class z6和9组成的最大数字 {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        s = s.replaceFirst("[6]","9");
        return Integer.parseInt(s);
    }
}
