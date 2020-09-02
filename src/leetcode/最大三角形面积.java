package leetcode;

/**
 * 给定包含多个点的集合，从其中取三个点组成三角形，返回能组成的最大三角形的面积。
 * <p>
 * 示例:
 * 输入: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
 * 输出: 2
 * 解释:
 * 这五个点如下图所示。组成的橙色三角形是最大的，面积为2。
 */
public class 最大三角形面积 {

    public double area(int x1, int x2, int x3, int y1, int y2, int y3) {
        return Math.abs(x1 * y2 + x2 * y3 + x3 * y1 - x1 * y3 - x2 * y1 - x3 * y2)/ 2.0;
    }

    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxarea = 0f;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    maxarea = Math.max(maxarea, area(points[i][0], points[j][0], points[k][0], points[i][1], points[j][1], points[k][1]));
                }
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        最大三角形面积 bar = new 最大三角形面积();
        int[][] areas = {
                {0,0},
                {0,1},
                {1,0},

        };
        System.out.println(bar.largestTriangleArea(areas));
    }
}
