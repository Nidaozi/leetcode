package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-09-12 10:54
 **/

public class 机器人能否返回原点 {
    public boolean judgeCircle(String moves) {
        int[] point = new int[]{0,0};
        char[] chars = moves.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] =='R'){
                point[1]++;
            } else if (chars[i] =='L'){
                point[1]--;
            } else if (chars[i] =='U'){
                point[0]++;
            } else if (chars[i] == 'D'){
                point[0]--;
            }
        }
        return point[0]==0&&point[1]==0;
    }
}
