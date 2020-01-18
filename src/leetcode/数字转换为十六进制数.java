package leetcode;

import javax.swing.text.StyledEditorKit;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-29 09:50
 **/

public class 数字转换为十六进制数 {
    public static String toHex(int num) {
        if (num == 0)
            return "0";
        StringBuilder stringBuilder = new StringBuilder();
        char[]s =new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        while (num!=0&&(stringBuilder.length()<8)){
            stringBuilder.append(s[num&0xf]);
            num>>=4;
        }

        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(toHex(Integer.MIN_VALUE));
    }
}
