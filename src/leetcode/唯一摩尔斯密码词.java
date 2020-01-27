package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-26 10:54
 **/

public class 唯一摩尔斯密码词 {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] strings = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-"
                ,".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> res = new HashSet<>();
        for (String word : words) {
            StringBuilder sb  = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(strings[c-'a']);
            }
            res.add(sb.toString());
        }
        return res.size();
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(strings));
    }
}
