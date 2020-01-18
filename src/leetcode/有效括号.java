package leetcode;

import java.util.HashMap;

/**
 * @program: demo01
 * @description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * @author: Mr.Ni
 * @create: 2019-01-25 17:47
 **/

public class 有效括号 {

    /** 
    * @Description: 蠢的离谱的算法 不过还能超过百分之九十七用户 哈哈 
    * @Param: [s] 
    * @return: boolean 
    * @Author: Mr.Ni 
    * @Date: 2019/1/25 
    */ 
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        char[] str = s.toCharArray();
        if (str.length == 1 || str == null) {
            return false;
        }
        if (str.length == 0) {
            return true;
        }
        char[] str1 = new char[10000];
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        int  j = 0;
        for (int i = 0; i < str.length; i++) {
            if (map.containsValue(str[i])) {
                str1[j++] = str[i];
            } else {
                if (j == 0 || map.get(str[i]) != str1[j - 1]) {
                    return false;
                } else {
                    j--;
                }
            }
        }
        if(j==0) {
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        String s = new String("{[]}");
        String s1 = new String("]}");
        String s2 = new String("((");
        System.out.println(isValid(s2));
    }
}
