package leetcode;


/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-09-18 13:16
 **/

public class 搜索旋转排序数组 {

    public static int search(int[] nums, int target) {
        if(nums.length<1){
            return -1;
        }
        int l = 0,r = nums.length-1,mid=0;
        while (l<r){
            mid = l+(r-l)/2;
            if((nums[0]<=target)){
                if(nums[mid]<target&&nums[mid]>=nums[0]){
                    l = mid+1;
                }else {
                    r = mid;
                }
            }else {
                if(nums[mid]>=target&&nums[mid]<nums[0]){
                    r = mid;
                }else {
                    l = mid+1;
                }
            }
        }
        return nums[l] == target?l:-1;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{4,5,6,7,0,1,2};
        System.out.println(search(arr1,4));
    }
}
