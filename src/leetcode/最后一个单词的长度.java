package leetcode;

/**
 * @program: demo01
 * @description: 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。  如果不存在最后一个单词，请返回 0 。  说明：一个单词是指由字母组成，但不包含任何空格的字符串。  示例:  输入: "Hello World" 输出: 5
 * @author: Mr.Ni
 * @create: 2019-02-02 14:47
 **/

public class 最后一个单词的长度 {
    public static int lengthOfLastWord(String s) {
        String[] m;
        if (s == null || s.length()==0)
            return 0;
        m = s.split(" ");
        if(m.length ==0)
            return 0;
        while ((m = s.split(" ")).length>1) {
            s = m[m.length-1];
        }
        return m[0].length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        String s1 = "a ";
        System.out.println(lengthOfLastWord(s1));
    }
}
