package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-30 13:42
 **/

public class 二进制表示中质数个计算置位 {
    public static int countPrimeSetBits(int L, int R) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(2,3,5,7));
        int count = 0;
        for (int i = L; i <= R; i++) {
            Integer j = Integer.bitCount(i);
            if(arrayList.contains(j)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(977581,888));
    }
}
