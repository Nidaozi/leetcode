package leetcode;

import sun.font.FontRunIterator;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-20 16:01
 **/

public class 螺旋矩阵II {
    public static int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int num = 1;
        int r1 = 0, r2 = n;
        int c1 = 0, c2 = n;
        while (num <= n * n) {
            for (int i = c1; i < c2; i++) {
                nums[r1][i] = num++;
            }
            for (int i = r1 + 1; i < r2; i++) {
                nums[i][c2-1] = num++;
            }
            if (r1 < r2 && c1 < c2) {
                for (int i = c2 - 2; i > c1; i--) {
                    nums[r2-1][i] = num++;
                }
                for (int i = r2 - 1; i > r1; i--) {
                    nums[i][c1] = num++;
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[][] x = generateMatrix(3);
        System.out.println(Arrays.deepToString(x));
    }
}
