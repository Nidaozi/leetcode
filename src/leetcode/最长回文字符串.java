package leetcode;

public class 最长回文字符串 {
    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        String ans = "";
        char[] chars = s.toCharArray();
        int[] limit = new int[2];
        for (int l = 0; l < n; l++) {
            for (int i = 0; i + l < n; i++) {
                int j = i + l;
                if (l == 0) {
                    dp[i][j] = 1;
                } else if (l == 1) {
                    dp[i][j] = (chars[i] == chars[j] ? 1 : 0);
                } else {
                    dp[i][j] = (chars[i] == chars[j] ? dp[i + 1][j - 1] : 0);
                }
                if (dp[i][j] == 1 && (1 + l )> (limit[1]-limit[0])) {
                    limit[0] = i;
                    limit[1] = j+1;

                }
            }
        }
        return s.substring(limit[0],limit[1]);
    }

    public static void main(String[] args) {
        最长回文字符串 bar = new 最长回文字符串();
        System.out.println(bar.longestPalindrome("a"));
    }
}
