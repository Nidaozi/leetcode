package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class 两数和 {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }
        int rect[] = new int[]{-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                rect[0] = map.get(target - nums[i]);
                rect[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return rect;
    }

    /*
     * @Description:
     * @Param: [args]
     * @return: void
     * @Author: Mr.Wang
     * @Date: 2019/1/23
     */
    public static void main(String[] args) {
        int[] nums = new int[]{2, 8, 7, 9, 1, 3};
        int target = 9;
        两数和 solution = new 两数和();
        int[] rect = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(rect));
    }
}
