package leetcode;

import java.util.Arrays;
import java.util.Random;

/**
 * @program: demo01
 * @description: 测试类
 * @author: Mr.Ni
 * @create: 2019-02-14 17:41
 **/

public class 测试Arrays {
    public static void main(String[] args) {
        int[]a = new int[10000];
        Random r = new Random();
        for (int i : a) {
            i = r.nextInt();
        }
        Arrays.sort(a);
    }
}
