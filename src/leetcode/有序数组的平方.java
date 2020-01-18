package leetcode;

import java.util.Arrays;

/**
 * @program: demo01
 * @description:
 * @author: Mr.Ni
 * @create: 2019-03-05 18:55
 **/

public class 有序数组的平方 {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
