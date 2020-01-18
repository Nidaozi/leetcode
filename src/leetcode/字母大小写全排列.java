package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-30 14:56
 **/

public class 字母大小写全排列 {
    public List<String> letterCasePermutation(String S) {
        char[] chars = S.toCharArray();
        List<String> list = new ArrayList<>();
        dg(chars,0,list);
        return list;
    }
    public void dg(char[]chars,int i,List<String> list){
        if(i==chars.length){
            list.add(String.valueOf(chars));
        }else {
            dg(chars,i+1,list);
            if(chars[i]<'0'||chars[i]>'9'){
                chars[i] ^= 32;
                dg(chars,i+1,list);
            }
        }
    }
}
