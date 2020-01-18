package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-28 19:26
 **/

public class 有效的完全平方数 {
    public static boolean isPerfectSquare(int num) {

        if (num==1)
            return true;
        int a = num/2;
        while ((double)a*a>num){
            a = (a+num/a)/2;
        }
        return a*a == num;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(100));
    }
}
