package leetcode;

import java.sql.RowId;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-09-18 20:55
 **/

public class 螺旋矩阵 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1<=r2&&c1<=c2){
            for (int i = c1; i <= c2; i++) {
                list.add(matrix[r1][i]);
            }
            for (int i = r1+1; i <= r2; i++) {
                list.add(matrix[i][c2]);
            }
            if(r1<r2&&c1<c2){
                for (int i = c2-1; i >c1 ; i--) {
                    list.add(matrix[r2][i]);
                }
                for (int i = r2; i >r1 ; i--) {
                    list.add(matrix[i][c1]);
                }
            }
            c1++;
            c2--;
            r1++;
            r2--;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(spiralOrder(nums));

    }
}
