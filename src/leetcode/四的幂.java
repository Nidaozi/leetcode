package leetcode;

/**
 * @program: demo01
 * @description:
 * @author: Mr.Ni
 * @create: 2019-04-26 22:29
 **/

public class 四的幂 {
    public static boolean isPowerOfFour(int num) {
        //num &(num-1)检测的num是不是2的幂
        //如果num是2的幂二进制就是100000这种 减一就是011111相与就是0
        //1好像是特例但是本例可以num<3直接false掉
        if (num < 3 || ((num & (num - 1)) != 0)) {
            return false;
        }
        //num已经是2的倍数了 那么判断一下1那位是不是奇数位就行 100是4每次左移两位
        //所以4的倍数1那位一定是奇数位 0x5=0101
        //return (num & 0x55555555) !=0;
        return num%3==1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
}
