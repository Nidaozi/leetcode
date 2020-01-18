package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-29 15:57
 **/

public class 判断子序列 {
    public boolean isSubsequence(String s, String t) {
        int j =0;
        int num = s.length();
        if(num==0){
            return true;
        }
        for (int i = 0; i < t.length(); i++) {
            if(s.charAt(j)==t.charAt(i)){
                j++;
            }
            if(j==num){
                return true;
            }
        }
        return false;
    }
}
