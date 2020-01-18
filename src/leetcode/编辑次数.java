package leetcode;

/**
 * @program: demo01
 * @description:
 * @author: Mr.Ni
 * @create: 2019-04-26 23:25
 **/

public class 编辑次数 {
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] cost = new int[m+1][n+1];
        //从有到无 删除
        for (int i = 0; i <= m; i++) {
            cost[i][0] = i;
        }
        //从无到有 添加
        for (int j = 0; j <= n; j++) {
            cost[0][j] = j;
        }
        for (int i = 1; i<=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    cost[i][j] = cost[i-1][j-1];
                }else{
                    //world1[0,i]变化到world2[0,j]需要多少次
                    //如果world1[0,i-1]变化到world2[0,j-1]需要n次
                    // 那么world1[0,i]变化到world2[0,j] 需要n+1次
                    //只需让world1[i]==world2[j]
                    //如果world1[0,i-1]变化到world2[0,j]需要n次
                    // 那么world1[0,i]变化到world2[0,j] 需要n+1次
                    //只需把world1[i]删除掉
                    //如果world1[0,i]变化到world2[0,j-1]需要n次
                    // 那么world1[0,i]变化到world2[0,j] 需要n+1次
                    //只需把world1[i]后面添加一个world2[j]
                    cost[i][j] = 1+Integer.min(Integer.min(cost[i-1][j-1],cost[i][j-1]),cost[i-1][j]);
                }
            }
        }
        return cost[m][n];
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "aacc";
        System.out.println(minDistance(s1,s2));
    }
}
