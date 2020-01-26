package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-25 19:29
 **/

public class 键盘行 {
    public static String[] findWords(String[] words) {
        String[] rec = new String[3];
        rec[0] = "qwertyuiop";
        rec[1] = "asdfghjkl";
        rec[2] = "zxcvbnm";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int index = 0;
        for (String s : rec) {
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    hashMap.put(c, index);
                    hashMap.put((char)(c - 'a' + 'A'), index);
                } else {
                    hashMap.put(c, index);
                    hashMap.put((char)(c + 'a' - 'A'), index);
                }
            }
            index++;
        }

        List<String> list = new LinkedList<>();
        for (String word : words) {
            int i = hashMap.get(word.charAt(0));
            boolean flag = true;
            for (char c : word.toCharArray()) {
                if (i != hashMap.get(c)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(word);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        String[] strings = new String[]{
                "Hello", "Alaska", "Dad", "Peace"
        };
        System.out.println(Arrays.toString(findWords(strings)));
    }
}
