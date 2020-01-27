package leetcode;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-27 15:46
 **/

public class 数字的补数 {
    public int findComplement(int num) {
        char[] chars = Integer.toBinaryString(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '1'){
                chars[i] = '0';
            }else {
                chars[i] = '1';
            }
        }
        return Integer.parseUnsignedInt(new String(chars),2);
    }
}
