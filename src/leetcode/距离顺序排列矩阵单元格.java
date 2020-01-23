package leetcode;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-23 16:50
 **/

public class 距离顺序排列矩阵单元格 {
    //用BFS也行 但是BFS(8叉树)需要挺多IF ELSE的就不用了
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] nums = new int[R * C][2];
        int index = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                nums[index][0] = i;
                nums[index++][1] = j;
            }
        }
        Arrays.sort(nums,(r1,r2)->{
            return (Math.abs(r0-r1[0]) + Math.abs(c0 - r1[1]))-(Math.abs(r0-r2[0]) + Math.abs(c0 - r2[1]));
        });
        return nums;
    }
}
