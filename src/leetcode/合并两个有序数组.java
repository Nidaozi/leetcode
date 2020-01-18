package leetcode;

import java.util.Arrays;

/**
 * @program: demo01
 * @description: 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * @author: Mr.Ni
 * @create: 2019-02-08 22:04
 **/

public class 合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = n+m-1,j=m-1,k=n-1; i >=0 ; i--) {
            if(j>=0&&(k<0||nums1[j]>nums2[k])){
                nums1[i] = nums1[j--];
            }else{
                nums1[i] = nums2[k--];
            }
        }
    }
}
