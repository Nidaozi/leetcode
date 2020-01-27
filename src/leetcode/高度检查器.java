package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-26 11:16
 **/

public class 高度检查器 {
    public int heightChecker(int[] heights) {
        int[] nums = new int[101];
        for (int height : heights) {
            nums[height]++;
        }
        int total = 0;
        for (int i = 1, j = 0; i < 101; i++) {
            while (nums[i]-- > 0) {
                if (heights[j++] != i) {
                    total++;
                }
            }
        }
        return total;
    }
}
