package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: demo01
 * @description:
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * @author: Mr.Ni
 * @create: 2019-04-15 13:49
 **/

public class 无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        int sum = 0;
        int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        char[] str= s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            sum++;
            if(map.containsKey(str[i])){
                max = Math.max(max,sum-1);
                sum = Math.min(i-map.get(str[i]),sum);
            }
            map.put(str[i],i);
        }
        return Math.max(sum,max);
    }
}
