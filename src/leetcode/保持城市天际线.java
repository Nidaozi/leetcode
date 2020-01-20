package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-20 15:14
 **/

public class 保持城市天际线 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowmax = new int[grid.length];
        int[] colmax = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                rowmax[i] = Math.max(rowmax[i], grid[i][j]);
                colmax[j] = Math.max(colmax[j], grid[i][j]);
            }
        }
        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                total += Math.min(rowmax[i], colmax[j]) - grid[i][j];
            }
        }
        return total;
    }

    public static void main(String[] args) {

    }
}
