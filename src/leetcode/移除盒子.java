package leetcode;

public class 移除盒子 {
    public static int removeBoxes(int[] boxes) {
        int[][][] dp = new int[100][100][100];
        return calculatePoints(boxes, dp, 0, boxes.length - 1, 0);
    }

    public static int calculatePoints(int[] boxes, int[][][] dp, int l, int r, int k) {
        if (l > r) return 0;
        if (dp[l][r][k] != 0) return dp[l][r][k];
        while (r > l && boxes[r] == boxes[r - 1]) {
            r--;
            k++;
        }
        dp[l][r][k] = calculatePoints(boxes, dp, l, r - 1, 0) + (k + 1) * (k + 1);
        for (int i = l; i < r; i++) {
            if(boxes[i]==boxes[r]){
                dp[l][r][k] = Math.max(dp[l][r][k],calculatePoints(boxes,dp,l,i,k+1)+calculatePoints(boxes,dp,i+1,r-1,0));
            }
        }
        return dp[l][r][k];
    }

    public static void main(String[] args) {
        int[]nums = {1,3,2,2,2,3,4,3,1};
        removeBoxes(nums);
    }
}
