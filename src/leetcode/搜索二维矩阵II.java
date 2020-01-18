package leetcode;

/**
 * @program: demo01
 * @description: 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。
 * 该矩阵具有以下特性：
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 * <p>
 * 给定 target = 20，返回 false。
 * @author: Mr.Ni
 * @create: 2019-03-01 12:12
 **/

public class 搜索二维矩阵II {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = 0;
        while (row<matrix.length&&row>=0&&col>=0&&col<matrix[0].length){
            if(matrix[row][col]<target){
                col++;
            }else if(matrix[row][col]>target){
                row--;
            }else{
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int[][] nums = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 5;
        int[][] nums2 = new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};
        int[][] nums3 = new int[][]{{1, 3, 5}};
        System.out.println(searchMatrix(nums2, target));
    }
}
