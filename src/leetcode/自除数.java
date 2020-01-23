package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-23 17:15
 **/

public class 自除数 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            int k = i;
            boolean flag = true;
            while (k != 0) {
                int m = k % 10;
                if (m == 0 || i % m != 0) {
                    flag = false;
                    break;
                }
                k /= 10;
            }
            if(flag){
                list.add(i);
            }
        }
        return list;
    }
}
