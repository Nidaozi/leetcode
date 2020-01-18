package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-29 16:35
 **/

public class 检测大写字母 {
    public static boolean detectCapitalUse(String word) {
        if (word.length()<1)
            return true;
        boolean flag = word.charAt(0)-'Z'<=0?true:false;
        int i = flag?1:0;
        for (int j = 1; j < word.length(); j++) {
            i+=word.charAt(j)-'Z'<=0?1:0;
        }
        if(flag&&(i!=word.length()&&i!=1)){
            return false;
        }
        return i==0||i==word.length()||(i==1&&flag);
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("Gffff"));
    }
}
