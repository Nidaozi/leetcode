package leetcode;

/**
 * @program: demo01
 * @description: 给定一个正整数，返回它在 Excel 表中相对应的列名称。  例如，
 * @author: Mr.Ni
 * @create: 2019-02-28 22:12
 **/

public class Excel表列名称 {
    public static String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while(n>0){
            n--;
            int c = n%26;
            stringBuilder.append((char)(c+'A'));
            n/=26;
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        int n = 701;
        System.out.println(convertToTitle(n));
    }
}
