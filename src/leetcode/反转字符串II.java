package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-31 09:32
 **/

public class 反转字符串II {
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length();) {
            if(i+2*k<=s.length()){
                reverse(chars,i,i+k-1);
                i+=2*k;
            } else if (i+2*k>s.length()&&i+k<=s.length()){
                reverse(chars,i,i+k-1);
                i+=2*k;
            }else {
                reverse(chars,i,s.length()-1);
                break;
            }

        }
        return String.valueOf(chars);
    }

    public static void reverse(char[]chars,int start,int end) {
        while (start<end){
            char c  = chars[start];
            chars[start++] = chars[end];
            chars[end--] = c;
        }
    }
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",2));
    }
}
