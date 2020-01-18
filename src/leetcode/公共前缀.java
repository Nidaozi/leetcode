package leetcode;

/**
 * @program: demo01
 * @description: 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * @author: Mr.Ni
 * @create: 2019-01-24 16:57
 **/

public class 公共前缀 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1)
            return "";
        String str = "";
        int min = 9999;//最小字符串长度
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min)
                min = strs[i].length();
        }
        for (int i = 0; i < min; i++) {
            boolean flag = true;
            char s = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i)!=s){
                    flag =false;
                    return str;
                }
            }
            if(flag == true){
                str+=s;
            }
        }
        return str;
    }
    /** 
    * @Description: 第一次沒看懂的算法 
    * @Param: [strs] 
    * @return: java.lang.String
    * @Author: Mr.Ni 
    * @Date: 2019/1/24 
    */ 
    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length==0) return "";

        String prefix = strs[0];

        for (int i=1; i<strs.length; i++) {
            while (strs[i].indexOf(prefix)!=0) {
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix=="") return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String []s = new String[]{"flower","flow","flight"};
        String[] s1 = new String[]{"a"};
        String[] s2 = new String[]{"aca","cba"};
        System.out.println(longestCommonPrefix2(s));
    }
}
