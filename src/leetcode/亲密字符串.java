package leetcode;

/**
 * @program: demo01
 * @description:
 * 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
 *
 *
 *
 * 示例 1：
 *
 * 输入： A = "ab", B = "ba"
 * 输出： true
 * 示例 2：
 *
 * 输入： A = "ab", B = "ab"
 * 输出： false
 * 示例 3:
 *
 * 输入： A = "aa", B = "aa"
 * 输出： true
 * 示例 4：
 *
 * 输入： A = "aaaaaaabc", B = "aaaaaaacb"
 * 输出： true
 * 示例 5：
 *
 * 输入： A = "", B = "aa"
 * 输出： false
 *
 *
 * 提示：
 *
 * 0 <= A.length <= 20000
 * 0 <= B.length <= 20000
 * A 和 B 仅由小写字母构成。
 * @author: Mr.Ni
 * @create: 2019-05-04 21:41
 **/

public class 亲密字符串 {
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length()){
            return false;
        }
        char[] chars = new char[6];
        int len = 0;
        int[]nums = new int[26];
        boolean flag = false;
        for (int i = 0; i < A.length(); i++) {
            if(A.charAt(i)!=B.charAt(i)){
                chars[len++] =A.charAt(i);
                chars[len++] =B.charAt(i);
            }
            if (len>4){
                return false;
            }
            nums[(int)(A.charAt(i)-'a')]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=2){
                flag = true;
                break;
            }
        }
        return (len == 0&&flag)||(len>0&&chars[0]==chars[3]&&chars[1]==chars[2]);
    }
}
