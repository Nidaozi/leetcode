package leetcode;

public class 连续子数组的最大和 {
//    public int maxSubArray(int[] nums) {
//        int maxnum = Integer.MIN_VALUE;
//        int curnum = 0;
//        for (int num : nums) {
//            if (curnum < 0) {
//                curnum = num;
//            } else {
//                curnum += num;
//            }
//            maxnum = Math.max(curnum, maxnum);
//        }
//        return maxnum;
//    }

    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
            res = Math.max(res,dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-1}));
    }
}
