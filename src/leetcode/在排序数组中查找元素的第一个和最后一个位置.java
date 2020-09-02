package leetcode;

import java.util.Arrays;

public class 在排序数组中查找元素的第一个和最后一个位置 {

    public int leftbinSearch(int[] nums, int target, int left, int right) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        if(left == nums.length){
            return -1;
        }
        return nums[left] == target ? left : -1;
    }

    public int rightbinSearch(int[] nums, int target, int left, int right) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid+1;
            } else if (nums[mid] > target) {
                right = mid ;
            }
        }
        return nums[left-1] == target ? left-1 : -1;
    }

    public int[] searchRange(int[] nums, int target) {
        if(nums==null||nums.length <1){
            return new int[]{-1,-1};
        }
        int[] result = {-1, -1};
        result[0] = leftbinSearch(nums, target, 0, nums.length);
        if(result[0] == -1){
            return result;
        }
        result[1] = rightbinSearch(nums, target, 0, nums.length);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {8,9,9};
        在排序数组中查找元素的第一个和最后一个位置 bar =
                new 在排序数组中查找元素的第一个和最后一个位置();

        int[] ints = bar.searchRange(nums, 8);
        System.out.println("ints = " + Arrays.toString(ints));
    }
}
