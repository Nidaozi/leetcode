package leetcode;

/**
 * @program: demo01
 * @description:
 * @author: Mr.Ni
 * @create: 2019-03-05 20:20
 **/

public class 增减字符串匹配 {
    public int[] diStringMatch(String S) {
        char[] str = S.toCharArray();
        int[] nums = new int[S.length()+1];
        int min  = 0;
        int max = S.length();
        for (int i = 0; i < S.length(); i++) {
            if(str[i] == 'I'){
                nums[i] = min++;
            }else{
                nums[i] = max--;
            }
        }
        nums[S.length()] = max;
        return nums;
    }
}
