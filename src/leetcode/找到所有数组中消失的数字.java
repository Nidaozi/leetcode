package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-26 10:43
 **/

public class 找到所有数组中消失的数字 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i])-1] > 0) {
                nums[Math.abs(nums[i])-1] *= -1;
            }
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
