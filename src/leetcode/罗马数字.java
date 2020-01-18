package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @program: demo01
 * @description: 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * @author: Mr.Ni
 * @create: 2019-01-24 13:20
 **/

public class 罗马数字 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int count = 0;
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (i!=str.length-1&&map.get(str[i]) >= map.get(str[i + 1])) {
                count+=map.get(str[i]);
            }else if(i==str.length-1){
                count+= map.get(str[i]);
            }else{
                count+=map.get(str[i+1])-map.get(str[i]);
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
