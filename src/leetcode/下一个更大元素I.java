package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-24 13:45
 **/

public class 下一个更大元素I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = -1;
        }
        boolean[] flag = new boolean[nums1.length];
        for (int i = nums2.length-1; i >= 0; i--) {
            for (int j = 0; j < nums1.length; j++) {
                if(!flag[j]){
                    if(nums2[i] == nums1[j]){
                        flag[j] = true;
                    }else if(nums2[i] > nums1[j]) {
                        nums[j] = nums2[i];
                    }
                }
            }
        }
        return nums;
    }
}
