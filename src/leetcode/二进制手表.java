package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-29 10:21
 **/

public class 二进制手表 {
    public static List<String> readBinaryWatch(int num) {
        List<String> s = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            int m = Integer.bitCount(i);
            if (m > num) {
                continue;
            }
            for (int j = 0; j < 60; j++) {
                int k = Integer.bitCount(j);
                if (k + m == num) {
                    s.add(Integer.toString(i) + ":" + (j < 10 ? "0" + Integer.toString(j) : Integer.toString(j)));

                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(readBinaryWatch(2));
    }
}
