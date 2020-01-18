package leetcode;

/**
 * @program: demo01
 * @description:
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 说明：
 *
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶:
 *
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * @author: Mr.Ni
 * @create: 2019-04-27 10:46
 **/

public class 两个数组的交集2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums2.length<nums1.length){
            int[] numss = nums1;
            nums1 = nums2;
            nums2 = numss;
        }
        int len = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]){
                    nums1[len++] = nums1[i];
                    break;
                }
            }
        }
        int[] nums3 = new int[len];
        for (int i = 0; i < len; i++) {
            nums3[i] = nums1[i];
        }
        return nums3;
    }
}
