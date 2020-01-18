package leetcode;

/**
 * @program: demo01
 * @description: 整数反转 有符号32位
 * @author: Mr.Ni
 * @create: 2019-01-24 12:42
 **/

public class 整数反转 {

    public static int reverse(int x) {
        long count = 0;
        while(x!=0){
            count=10*count+(x%10);
            x/=10;
        }
        if(count>Integer.MAX_VALUE||count<-Integer.MAX_VALUE-1){
            return 0;
        }
        return (int)count;
    }

    public static void main(String[] args) {
        System.out.println(reverse(2147483647 ));
    }
}
