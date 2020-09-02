package 阿里巴巴;

import java.util.Scanner;

public class 题目二 {
    private static int nums = 0;
    private static int xieliang = 0;
    private static int[][] ha;

    public static void dfs(int n, int i, int xie, int miao) {
        if (i == n) {
            if (nums <= i) {
                nums = i;
                xieliang = Math.max(xie, xieliang);
            }
            return;
        }
        if (xie > ha[i][0] && miao > 0) {
            dfs(n, i + 1, xie, miao - 1 + ha[i][1]);
            dfs(n, i + 1, xie - ha[i][0], miao + ha[i][1]);
        } else if (xie > ha[i][0] && miao == 0) {
            dfs(n, i + 1, xie - ha[i][0], miao + ha[i][1]);
        } else if (xie < ha[i][0] && miao > 0) {
            dfs(n, i + 1, xie, miao - 1 + ha[i][1]);
        } else {
            if (nums <= i) {
                nums = i;
                xieliang = Math.max(xie, xieliang);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            ha = new int[n][2];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 2; k++) {
                    ha[j][k] = scanner.nextInt();
                }
            }
            dfs(n, 0, m, 0);
            System.out.println(nums + " " + xieliang);

            xieliang = 0;
            nums = 0;

        }
    }
}
