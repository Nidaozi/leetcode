package leetcode;

/**
 * @program: demo01
 * @description: 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。  你可以假设数组是非空的，并且给定的数组总是存在众数。
 * @author: Mr.Ni
 * @create: 2019-02-28 22:07
 **/

public class 众数 {
    public int majorityElement(int[] nums) {
        int num = nums[0];
        int count =1;
        for (int i = 1; i < nums.length; i++) {
            if(num!=nums[i]){
                if(count!=0){
                    count --;
                }else{
                    count++;
                    num = nums[i];
                }
            }
            else{
                count++;
            }
        }
        return num;
    }
}
