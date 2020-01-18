package leetcode;

/**
 * @program: demo01
 * @description: 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。  如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。  注意你不能在买入股票前卖出股票。
 * @author: Mr.Ni
 * @create: 2019-02-12 12:42
 **/

public class 买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        if(prices.length<2){
            return 0;
        }
        int[] nums = new int[prices.length];
        int min = prices[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i-1],prices[i]-min);
            if(prices[i]<min){
                min = prices[i];
            }
        }
        return nums[nums.length-1];
    }
}
