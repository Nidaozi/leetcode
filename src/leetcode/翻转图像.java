package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-24 19:54
 **/

public class 翻转图像 {
    public int[][] flipAndInvertImage(int[][] A) {
        int C = A[0].length;
        for (int[] ints : A) {
            for (int i = 0; i < (C + 1) / 2; i++) {
                int temp = ints[i] ^ 1;
                ints[i] = ints[C - 1 - i] ^ 1;
                ints[C - 1 - i] = temp;
            }
        }
        return A;
    }
}
