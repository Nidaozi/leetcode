package leetcode;

import java.util.Arrays;
import java.util.Random;

public class 归并排序 {
    public int[] tmp;
    public static final int LENGTH1E6 = 1000000;
    public static final Random RANDOM = new Random();

    public void mergeSort(int[] nums, int left, int right) {
        if (left >= right)
            return;
        int mid = left + ((right - left) >> 1);
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        int i = left, j = mid + 1;
        int cnt = 0;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                tmp[cnt++] = nums[i++];
            } else {
                tmp[cnt++] = nums[j++];
            }
        }
        while (i <= mid) {
            tmp[cnt++] = nums[i++];
        }
        while (j <= right) {
            tmp[cnt++] = nums[j++];
        }
        for (int index = 0; index < right - left + 1; index++) {
            nums[index + left] = tmp[index];
        }
    }

    public static void main(String[] args) {
        归并排序 foo = new 归并排序();
        int[] nums = new int[LENGTH1E6];
        int[] nums1 = new int[LENGTH1E6];
        foo.tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = RANDOM.nextInt(LENGTH1E6);
            //nums[i] =0;
            nums1[i] = nums[i];
        }
        long start_time, end_time;
        {
            start_time = System.currentTimeMillis();
            Arrays.sort(nums);
            end_time = System.currentTimeMillis();
            System.out.println("java sort :" + (end_time - start_time) + "ms");
        }
        {
            start_time = System.currentTimeMillis();
            foo.mergeSort(nums1, 0, nums.length - 1);
            end_time = System.currentTimeMillis();
            System.out.println("my sort :" + (end_time - start_time) + "ms");
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums1[i]) {
                System.out.println("sort false");
                return;
            }
        }
        System.out.println("good sort");
    }
}
