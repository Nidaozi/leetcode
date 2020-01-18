package leetcode;

import java.util.Arrays;

/**
 * @program: demo01
 * @description:
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 *
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 * 注意事项：您可以假定该字符串只包含小写字母。
 * @author: Mr.Ni
 * @create: 2019-04-28 23:13
 **/

public class 字符串中的第一个唯一字符 {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        for (int i = 0; i <chars.length ; i++) {
            chars[i] = -2;
        }
        char[] chars1 = s.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            int num = (int)(chars1[i] - 'a');
            if(chars[num] == -2){
                chars[num] = -1;
            }else if(chars[num] == -1){
                chars[num]++;
            }
        }
        for (int i = 0; i <chars1.length ; i++) {
            int num = (int)(chars1[i] - 'a');
            if(chars[num] == -1){
                return i;
            }
        }
        return -1;
    }
}
