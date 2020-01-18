package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-29 13:08
 **/

public class 赎金信 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[]num = new int[26];
        char[] s = magazine.toCharArray();
        for (char c : s) {
            num[c-'a']++;
        }
        s = ransomNote.toCharArray();
        for (char c : s) {
            if(num[c-'a']-1>0){
                num[c-'a']--;
            }else {
                return false;
            }
        }
        return true;
    }
}
