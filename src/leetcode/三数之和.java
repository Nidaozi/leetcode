package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: leetcode
 * @description: 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 * @author: Mr.Ni
 * @create: 2019-07-10 21:22
 **/

public class 三数之和 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length < 3)
            return lists;
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int L = i + 1;
            int R = len - 1;
            while (L<R ){
                int sum = nums[i] +nums[L]+nums[R];
                if (sum==0){
                    lists.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L]==nums[L+1]) L++;
                    while (L<R && nums[R]==nums[R-1]) R--;
                    L++;
                    R--;
                }
                else if(sum<0)L++;
                else {
                    R--;
                }
            }
        }
        return lists;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
