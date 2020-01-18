package leetcode;

/**
 * @program: demo01
 * @description:
 * 编写一个算法来判断一个数是不是“快乐数”。
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和
 * ，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，
 * 那么这个数就是快乐数。
 * 示例:
 * 输入: 19
 * 输出: true
 * 解释:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * @author: Mr.Ni
 * @create: 2019-03-03 20:57
 **/

public class 快乐数 {
    public static boolean isHappy(int n) {
        int sum;
        while(n!=1){
            sum = 0;
            while(n!=0){
                sum+=(n%10)*(n%10);
                n/=10;
            }
            if(sum == 4){
                return false;
            }
            n = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
