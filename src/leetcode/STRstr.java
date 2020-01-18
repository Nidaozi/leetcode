package leetcode;

import java.util.Random;

/**
 * @program: demo01
 * @description: 实现 strStr() 函数。  给定一个 haystack 字符串和一个 needle 字符串，
 * 在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
 * 如果不存在，则返回  -1。
 * @author: Mr.Ni
 * @create: 2019-01-28 12:10
 **/

public class STRstr {
    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        if(needle.length()>haystack.length()){
            return -1;
        }
        char []str1 = haystack.toCharArray();
        char []str2 = needle.toCharArray();
        for(int i = 0;i<haystack.length();i++){
            if(str1.length -i < str2.length){
             break;
            }
            int j =i;
            boolean flag = true;
            for (char c : str2) {
                if(str1[j++] != c){
                    flag = false;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("ll");
        System.out.println(strStr(str1,str2));
    }
}
