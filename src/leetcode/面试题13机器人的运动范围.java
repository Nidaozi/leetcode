package leetcode;

/**
 * 面试题13. 机器人的运动范围
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
 * 它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。
 * 请问该机器人能够到达多少个格子？
 * 示例 1：
 * 输入：m = 2, n = 3, k = 1
 * 输出：3
 * 示例 1：
 * 输入：m = 3, n = 1, k = 0
 * 输出：1
 * 提示：
 * 1 <= n,m <= 100
 * 0 <= k <= 20
 * 通过次数17,043提交次数35,349
 */
public class 面试题13机器人的运动范围 {
//    public int get(int x) {
//        int res = 0;
//        while (x > 0) {
//            res += x % 10;
//            x /= 10;
//        }
//        return res;
//    }
//
//    public int movingCount(int m, int n, int k) {
//        int[][] nums = new int[m][n];
//        nums[0][0] = 1;
//        int res = 1;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if ((i == 0 && j == 0) || get(i) + get(j) > k) continue;
//                if (i > 0)
//                    nums[i][j] |= nums[i - 1][j];
//                if (j > 0)
//                    nums[i][j] |= nums[i][j - 1];
//                res += nums[i][j];
//            }
//        }
//        return res;
//    }
    boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        visited = new boolean[m][n];
        return DFS(0, 0, k);
    }


    public int DFS(int m, int n, int k) {
        if (m < 0 || n < 0 || m >= visited.length || n >= visited[0].length || getNum(m, n) > k || visited[m][n]) {
            return 0;
        }
        visited[m][n] = true;
        return 1 +  DFS(m + 1, n, k)  + DFS(m, n + 1, k);

    }

    public int getNum(int m, int n) {
        return m / 100 + m / 10 + m % 10 + n / 100 + n / 10 + n % 10;
    }

    public static void main(String[] args) {
        面试题13机器人的运动范围 bar = new 面试题13机器人的运动范围();
        System.out.println(bar.movingCount(2, 3, 1) == 3);
        System.out.println(bar.movingCount(3, 1, 0) == 1);
        System.out.println(bar.movingCount(10, 10, 1));
    }
}
