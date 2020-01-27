package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-26 11:25
 **/

public class 单词规律 {
    public static boolean wordPattern(String pattern, String str) {
        if (pattern == null || str == null || pattern.length() < 1) {
            return true;
        }
        if(pattern.length()!=str.split(" ").length){
            return false;
        }
        HashMap<Character, String> hashMap = new HashMap<>();
        int i = 0;
        for (String s : str.split(" ")) {
            if(hashMap.get(pattern.charAt(i))!=null){
                if(!hashMap.get(pattern.charAt(i)).equals(s)){
                    return false;
                }
            }else {
                hashMap.put(pattern.charAt(i),s);
            }
            i++;
        }
        Set<Character>key = new HashSet<>();
        Set<String>values = new HashSet<>();
        hashMap.forEach((k1,v1)->{
            key.add(k1);
            values.add(v1);
        });
        return key.size()==values.size();
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "cat dog dog cat"));
    }
}
