package leetcode;

/**
 * @program: leetcode
 * @description: (()())(())(()(()))
 * @author: Mr.Ni
 * @create: 2019-09-01 16:18
 **/

public class 删除最外层的括号 {
    public static String removeOuterParentheses(String S) {
        StringBuilder ans = new StringBuilder();
        int R = 0;
        int L = 0;
        for (int i = 0; i <S.length(); i++) {
            if(S.charAt(i)=='('){
                L++;
            }else {
                R++;
            }
            if(R==L){
                ans.append(S.substring(i-L*2+2,i));
                R=0;
                L=0;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));

    }
}
