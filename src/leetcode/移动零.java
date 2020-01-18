package leetcode;

/**
 * @program: demo01
 * @description:
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * @author: Mr.Ni
 * @create: 2019-04-17 22:52
 **/

public class 移动零 {
    public static void moveZeroes(int[] nums) {
        if(nums ==null){
            return;
        }
        for (int i = 0,j=0; i < nums.length; i++) {
            if(nums[i]==0){
                continue;
            }
            int temp =0;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j++] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
}
