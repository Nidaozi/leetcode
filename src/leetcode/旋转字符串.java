package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-30 21:21
 **/

public class 旋转字符串 {
    public boolean rotateString(String A, String B) {
        return A.length()== B.length()&&((A+=A).indexOf(B)!=-1);
    }
}
