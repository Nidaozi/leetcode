package leetcode;

/**
 * @program: demo01
 * @description:
 * @author: Mr.Ni
 * @create: 2019-04-18 15:45
 **/

public class 压缩字符串 {
    public static int compress(char[] chars) {
        if (chars.length <= 1) {
            return chars.length;
        }
        int v = 0, w = 0, x = 0;
        boolean b = false;
        for (v = 0; v < chars.length; v++) {
            if (v == chars.length - 1 || chars[v] != chars[v + 1]) {
                int count = v - w + 1;
                chars[x] = chars[w];
                x++;
                if (count > 1) {
                    for (int i = 1000; i > 0; i /= 10) {
                        if (count / i != 0 || b) {
                            b = true;
                            chars[x] = (char) (count / i + 48);
                            x++;
                            count %= i;
                        }
                    }
                    b = false;
                }

                w = v + 1;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        char[] chars=  new char[]{'a','a','b','b','c','c','c'};
        char[] chars3=  new char[]{'b','c','c','c','a','a','b','b'};
        char[] chars2=  new char[]{'a','b','c'};
        System.out.println(compress(chars3));

    }
}
