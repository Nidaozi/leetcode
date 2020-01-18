package leetcode;

/**
 * @program: demo01
 * @description:
 * 我们正在玩一个猜数字游戏。 游戏规则如下：
 * 我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
 * 每次你猜错了，我会告诉你这个数字是大了还是小了。
 * 你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
 *
 * -1 : 我的数字比较小
 *  1 : 我的数字比较大
 *  0 : 恭喜！你猜对了！
 * 示例 :
 *
 * 输入: n = 10, pick = 6
 * 输出: 6
 * @author: Mr.Ni
 * @create: 2019-04-25 12:56
 **/

public class 猜数字大小 {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        int num = (low+high)/2;
        int flag = guess(num);
        while(flag!=0){
            if(flag == 1){
                low = num +1;

            }else{
                high = num -1;
            }
            num = low+(high-low)/2;
            flag = guess(num);
        }
        return num;

    }
    int guess(int num){
        System.out.println();
        return 0;
    }
}
