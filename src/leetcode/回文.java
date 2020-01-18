package leetcode;

/**
 * @program: demo01
 * @description: 判断一个整数是否是回文数。回文数是指正序（从左向右）
 * 和倒序（从右向左）读都是一样的整数。
 * @author: Mr.Ni
 * @create: 2019-01-24 13:01
 **/

public class 回文 {
    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        String s = Integer.toString(x);
        int t = s.length()-1;
        for (int i = 0; i < t; i++,t--) {
            if(s.charAt(i)!=s.charAt(t))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 200020002;
        System.out.println(isPalindrome(x));
    }
}
