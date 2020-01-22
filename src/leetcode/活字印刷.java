package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-22 16:18
 **/

public class 活字印刷 {
    public int numTilePossibilities(String tiles) {
        int[] chars = new int[26];
        for (int i = 0; i < tiles.length(); i++) {
            chars[tiles.charAt(i) - 'A']++;
        }
        return solve(chars);
    }

    private int solve(int[] chars) {
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>0){
                sum++;
                chars[i] --;
                sum += solve(chars);
                chars[i]++;
            }
        }
        return sum;
    }
}
