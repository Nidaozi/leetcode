package leetcode;

/**
 * @program: demo01
 * @description: 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。  设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。  注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * @author: Mr.Ni
 * @create: 2019-02-12 13:01
 **/

public class 买卖股票的最佳时机II {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]-prices[i-1]>0){
                maxProfit +=prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }
}
