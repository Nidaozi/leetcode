package leetcode;

import java.util.Stack;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-24 14:11
 **/

public class 比较含退格的字符串 {
    public boolean backspaceCompare(String S, String T) {
        System.out.println(build(S));
        return build(S).equals(build(T));
    }
    public String build(String S){
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if(c != '#'){
                stack.push(c);
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}
