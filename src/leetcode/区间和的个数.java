package leetcode;

import java.util.TreeMap;

public class 区间和的个数 {
    public int countRangeSum(int[] nums, int lower, int upper) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //键值为区间和和这个区间和出现的次数
        TreeMap<Long, Integer> tree = new TreeMap<>();
        tree.put(0L, 1);
        //[-2,5,-1]
        //-2 3 2
        int count = 0;
        long sum = 0L;
        for (int num : nums) {
            sum += num;
            //subMap()返回一个值在sum - upper 和sum - lower 之间的子集合，values()方法获得这个映射的值得视图
            for (int cnt : tree.subMap(sum - upper, true, sum - lower, true).values()) {
                count += cnt; //统计满足条件的区间和个数
            }
            tree.put(sum, tree.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        区间和的个数 bar = new 区间和的个数();
        System.out.println(bar.countRangeSum(new int[]{-2, 5, -1}, -2, 2));
    }

}
