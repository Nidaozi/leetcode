package leetcode;

public class 正则表达式匹配 {
    public boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        if (p.charAt(j-1) == '.') {
            return true;
        }
        return s.charAt(i-1) == p.charAt(j-1);
    }

    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j-2];
                    if(matches(s,p,i,j-1)){
                        dp[i][j] = dp[i][j]||dp[i-1][j];
                    }
                }else {
                    if(matches(s,p,i,j)){
                        dp[i][j] = dp[i-1][j-1];
                    }
                }
            }
        }


        return dp[n][m];
    }

    public static void main(String[] args) {
        正则表达式匹配 bar = new 正则表达式匹配();
        System.out.println(bar.isMatch("aaaa","a.a*"));
    }
}
