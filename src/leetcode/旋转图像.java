package leetcode;

/**
 * @program: demo01
 * @description: 给定一个 n × n 的二维矩阵表示一个图像。
 * <p>
 * 将图像顺时针旋转 90 度。
 * <p>
 * 说明：
 * <p>
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 * <p>
 * 示例 1:
 * <p>
 * 给定 matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * 示例 2:
 * <p>
 * 给定 matrix =
 * [
 * [ 5, 1, 9,11],
 * [ 2, 4, 8,10],
 * [13, 3, 6, 7],
 * [15,14,12,16]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [15,13, 2, 5],
 * [14, 3, 4, 1],
 * [12, 6, 8, 9],
 * [16, 7,10,11]
 * ]
 * @author: Mr.Ni
 * @create: 2019-04-27 22:10
 **/

public class 旋转图像 {
    public void rotate(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length-1;
        //(n+1)/2圈
        while (left <= right) {
            int p1 = left;
            int p2 = right;
            //每一圈要转多少元素
            while (p1!=right){
                int temp = matrix[left][p1];
                matrix[left][p1] = matrix[p2][left];
                matrix[p2][left] = matrix[right][p2];
                matrix[right][p2] = matrix[p1][right];
                matrix[p1][right] = temp;
                p1++;
                p2--;
            }
            left++;
            right--;
        }
    }
}
