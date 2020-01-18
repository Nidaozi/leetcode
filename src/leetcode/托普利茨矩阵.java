package leetcode;

import java.util.concurrent.ForkJoinPool;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-30 13:49
 **/

public class 托普利茨矩阵 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i-1>=0 &&j-1>=0){
                    if(matrix[i][j]!=matrix[i-1][j-1])
                        return false;
                }
            }
        }
        return true;
    }
}
