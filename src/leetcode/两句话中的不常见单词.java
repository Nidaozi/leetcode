package leetcode;

import java.util.*;

/**
 * @program: demo01
 * @description: 给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。）
 * <p>
 * 如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。
 * <p>
 * 返回所有不常用单词的列表。
 * <p>
 * 您可以按任何顺序返回列表。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：A = "this apple is sweet", B = "this apple is sour"
 * 输出：["sweet","sour"]
 * 示例 2：
 * <p>
 * 输入：A = "apple apple", B = "banana"
 * 输出：["banana"]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= A.length <= 200
 * 0 <= B.length <= 200
 * A 和 B 都只包含空格和小写字母。
 * @author: Mr.Ni
 * @create: 2019-05-04 19:59
 **/

public class 两句话中的不常见单词 {
    public static String[] uncommonFromSentences(String A, String B) {
        String s = A+" "+B;
        String[] s1= s.split(" ");
        Map<String,Integer> hashmap = new HashMap<>();
        for (String s2 : s1) {
            if(hashmap.containsKey(s2)){
                hashmap.put(s2,1);
            }else {
                hashmap.put(s2,0);
            }
        }
        List<String> list = new LinkedList<>();
        for (Map.Entry<String,Integer> entry : hashmap.entrySet()){
            if(entry.getValue()==0){
                list.add(entry.getKey());
            }
        }
        String[] strings = new String[list.size()];
        int i = 0;
        for (String s2 : list) {
            strings[i++] =s2;
        }
        return strings;
    }

    public static void main(String[] args) {
        String s1 = "apple apple";
        String s2 = "banana";
        String[]s3 = uncommonFromSentences(s1,s2);
        for (String s : s3) {
            System.out.println(s);
        }
    }
}
