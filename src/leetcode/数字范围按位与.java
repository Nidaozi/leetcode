package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-30 17:07
 **/

public class 数字范围按位与 {
    public int rangeBitwiseAnd(int m, int n) {
        int t = 0;
        while(m!=n){
            m>>=1;
            n>>=1;
            t++;
        }
        return n<<t;
    }
}
