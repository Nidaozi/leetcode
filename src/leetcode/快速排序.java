package leetcode;

import java.util.Arrays;
import java.util.Random;

public class 快速排序 {
    public static final int NUMB1E6 = 1000000;
    public static final int NUMB1E7 = 10000000;
    Random random = new Random();
    public int swap_count = 0;

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public int partition(int[] nums, int left, int right) {
        int p1 = left - 1;
        int pivot = nums[right];
        for (int i = left; i < right; i++) {
            if (nums[i] <= pivot) {
                swap(nums, ++p1, i);
            }
        }
        swap(nums, ++p1, right);
        return p1;
    }

    public int radomlist_partition(int[] nums, int left, int right) {
        int i = random.nextInt(right - left + 1) + left;
        swap(nums, i, right);
        return partition(nums, left, right);
    }

    public void qsort(int[] nums, int left, int right) {
        if (left + 15 < right) {
            int mid = radomlist_partition(nums, left, right);
            qsort(nums, left, mid - 1);
            qsort(nums, mid + 1, right);
        } else {
            if (left < right) {
                insert_sort(nums, left, right);
            }
        }
    }

    public void insert_sort(int[] nums, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int tmp = nums[i];
            int j = i;
            while (j > left && nums[j - 1] > tmp) {
                nums[j] = nums[j - 1];
                j--;
            }
            nums[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[NUMB1E6];
        Random random = new Random();
        int[] nums1 = new int[NUMB1E6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(NUMB1E6);

            nums1[i] = nums[i];
        }
        快速排序 bar = new 快速排序();
        long start_time, end_time;
        {
            start_time = System.currentTimeMillis();
            //bar.qsort(nums, 0, nums.length - 1);
            Arrays.sort(nums1);
            end_time = System.currentTimeMillis();
            System.out.println("java qsort " + (end_time - start_time) + "ms");
        }
        {
            start_time = System.currentTimeMillis();
            bar.qsort(nums, 0, nums.length - 1);
            end_time = System.currentTimeMillis();
            System.out.println("my qsort " + (end_time - start_time) + "ms");
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums1[i]) {
                System.out.println("is not sort");
                return;
            }
        }
        System.out.println("is good sort");
    }
}
