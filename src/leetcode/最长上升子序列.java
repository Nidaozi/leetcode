package leetcode;

public class 最长上升子序列 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length+1];
        int len = 1;
        dp[1] = nums[0];
        if(nums.length==0) return 0;
        for (int i = 1; i < nums.length; i++) {
            if(dp[len]<nums[i]){
                dp[++len] = nums[i];
            }else {
                int l = 1,r = len,pos = l+(r-l)/2;
                while (l<r){
                    if(dp[pos]<nums[i]){
                        l = pos+1;
                    }else {
                        r = pos;
                    }
                    pos = l+(r-l)/2;
                }
                if(dp[l]>nums[i]) dp[l] = nums[i];
            }
        }
        return len;

    }
    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,3,4};
        最长上升子序列 bar  = new 最长上升子序列();
        System.out.println(bar.lengthOfLIS(nums));

    }
}
