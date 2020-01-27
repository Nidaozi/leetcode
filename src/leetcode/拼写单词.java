package leetcode;

import java.util.Arrays;
import java.util.Set;

/**
 * @program: leetcode
 * @description:
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 *
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 *
 * 注意：每次拼写时，chars 中的每个字母都只能用一次。
 *
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 * 示例 1：
 *
 * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
 * 输出：6
 * 解释：
 * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
 * 示例 2：
 *
 * 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * 输出：10
 * 解释：
 * 可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
 * 提示：
 *
 * 1 <= words.length <= 1000
 * 1 <= words[i].length, chars.length <= 100
 * 所有字符串中都仅包含小写英文字母
 * @author: Mr.Ni
 * @create: 2020-01-27 12:32
 **/

public class 拼写单词 {
    public int countCharacters(String[] words, String chars) {
        int[] str = new int[26];
        for (char c : chars.toCharArray()) {
            str[c - 'a']++;
        }
        int sum = 0;
        int[] str1 = Arrays.copyOf(str,str.length);
        for (String word : words) {
            boolean flag = true;
            for (char c : word.toCharArray()) {
                str1[c-'a']--;
                if(str1[c-'a']<0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                sum+=word.length();
            }
            str1 = Arrays.copyOf(str,str.length);
        }
        return sum;
    }
}
