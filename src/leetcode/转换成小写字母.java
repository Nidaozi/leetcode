package leetcode;

/**
 * @program: demo01
 * @description:
 * @author: Mr.Ni
 * @create: 2019-03-05 19:10
 **/

public class 转换成小写字母 {
    public static String toLowerCase(String str) {
        char[] str1 = str.toCharArray();
        for (int i = 0; i < str1.length; i++) {
            if(str1[i]<='Z'&&str1[i]>='A'){
                str1[i] = (char)(str1[i] - 'A' +'a');
            }
        }
        return new String(str1);
    }

    public static void main(String[] args) {
        String s = "HELLO WORLD";
        System.out.println(toLowerCase(s));
    }
}
