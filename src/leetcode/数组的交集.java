package leetcode;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: demo01
 * @description:
 * @author: Mr.Ni
 * @create: 2019-05-05 17:17
 **/

public class 数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)) {
                set1.add(i);
            }
        }
        int[] nums3 = new int[set1.size()];
        int i = 0;
        for (Integer integer : set1) {
            nums3[i++] = integer;
        }
        return nums3;
    }
}
