package leetcode;

/**
 * @program: demo01
 * @description:
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 * @author: Mr.Ni
 * @create: 2019-04-30 19:11
 **/

public class 有效的字母异位词 {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        int[] num1 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            num1[(int)(s.charAt(i) - 'a')]++;
            num1[(int)(t.charAt(i) - 'a')]--;
        }
        for (int i = 0; i < num1.length; i++) {
            if(num1[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(isAnagram(s1,s2));
    }
}
