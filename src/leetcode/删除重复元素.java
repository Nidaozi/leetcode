package leetcode;


/**
 * @program: demo01
 * @description: 给定一个排序数组，你需要在原地删除重复出现的元素，
 * 使得每个元素只出现一次，返回移除后数组的新长度。  不要使用额外的数组空间，
 * 你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @author: Mr.Ni
 * @create: 2019-01-27 11:27
 **/

public class 删除重复元素 {
    public static int removeDuplicates(int[] nums) {
        int len = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[len]){
                nums[++len] = nums[i];
            }
        }
        return len+1;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{1,2,2,3,4,5,5,6,7,8,9,9};

        System.out.println(removeDuplicates(nums));
    }
}
