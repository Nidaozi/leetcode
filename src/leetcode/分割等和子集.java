package leetcode;

import java.util.Scanner;

public class 分割等和子集 {
    public boolean canPartition(int[] nums) {
        if(nums == null){
            return false;
        }
        int sum =0;
        for (int num : nums) {
            sum += num;
        }
        if(sum %2 != 0){
            return false;
        }
        boolean[] dp = new boolean[sum+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = false;
        }
        dp[0] = true;
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= sum; j++) {
                if(j - nums[i-1]>=0){
                    dp[j] = dp[j]||dp[j-nums[i-1]];
                }
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        System.out.println("input string");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        String join = String.join(" ", s1);
        System.out.println("join  : "+join);
    }
}
